package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @PostMapping
    public void SaveCustomer(String id,String name,String address,double salary){
        System.out.println("Wade Hri");
        System.out.println(id+""+name+""+address+""+salary);
    }
}
