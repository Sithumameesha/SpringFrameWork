package lk.ijse.Spring.spring.controller;

import lk.ijse.Spring.spring.Dto.CustomerDto;
import lk.ijse.Spring.spring.Entity.Customer;
import lk.ijse.Spring.spring.Repo.CustomerRepo;
import lk.ijse.Spring.spring.Utill.ResponseUtill;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
     private CustomerRepo repo;
    @Autowired
    private ModelMapper mapper;
    @PostMapping
    public ResponseUtill SaveCustomer(@ModelAttribute CustomerDto dto){
     if (repo.existsById(dto.getId())){
         throw new RuntimeException("Customer Already Exist. Please enter another id..!");
     }
        Customer map = mapper.map(dto, Customer.class);
//        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary() );
        repo.save(map);
        return new ResponseUtill("Ok","Successfully Login",null);
    }
    @DeleteMapping(params = {"id"})
    public ResponseUtill deleteCustomer( @RequestParam String id){
        if (repo.existsById(id)){
            repo.deleteById(id);
            return new ResponseUtill("Ok","Successfully Deleted",null);
        }
        throw new RuntimeException("Try Again");

    }
    @PutMapping
    public ResponseUtill updateCustomer(@RequestBody CustomerDto dto){
        if (repo.existsById(dto.getId())){
            Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary() );
            repo.save(customer);
            return new ResponseUtill("Ok","Successfully Updated",null);
        }
        throw new RuntimeException("Customer Cannnot Find. Please try again..!");
    }
    @GetMapping
    public ResponseUtill getAllCustomer(){
//        ArrayList<CustomerDto>arrayList=new ArrayList<>();
        List<Customer> all = repo.findAll();



        return new ResponseUtill("Ok","Successfully Loaded",all);
    }
}
