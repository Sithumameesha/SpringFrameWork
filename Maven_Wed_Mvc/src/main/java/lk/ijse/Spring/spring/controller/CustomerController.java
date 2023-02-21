package lk.ijse.Spring.spring.controller;

import lk.ijse.Spring.spring.Dto.CustomerDto;
import lk.ijse.Spring.spring.Entity.Customer;
import lk.ijse.Spring.spring.Repo.CustomerRepo;
import lk.ijse.Spring.spring.Utill.ResponseUtill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
     private CustomerRepo repo;
    @PostMapping
    public ResponseUtill SaveCustomer(@ModelAttribute CustomerDto dto){
        System.out.println("Wade Hri");
        System.out.println(dto.toString());
        Customer customer = new Customer(dto.getId(), dto.getName(), dto.getAddress(), dto.getSalary() );
        repo.save(customer);
        return new ResponseUtill("Ok","Successfully Login",null);
    }
    @DeleteMapping(params = {"id"})
    public ResponseUtill deleteCustomer( @RequestParam String id){
        return new ResponseUtill("Ok","Successfully Deleted",null);

    }
    @PutMapping
    public ResponseUtill updateCustomer(@RequestBody CustomerDto dto){
        return new ResponseUtill("Ok","Successfully Updated"+dto.getId(),null);
    }
    @GetMapping
    public ResponseUtill getAllCustomer(){
        ArrayList<CustomerDto>arrayList=new ArrayList<>();
        arrayList.add(new CustomerDto("C001","Sithum","Galle",1000));
        arrayList.add(new CustomerDto("C002","Sithum","Galle",2000));
        arrayList.add(new CustomerDto("C003","Sithum","Galle",3000));
        arrayList.add(new CustomerDto("C004","Sithum","Galle",4000));


        return new ResponseUtill("Ok","Successfully Loaded",arrayList);
    }
}
