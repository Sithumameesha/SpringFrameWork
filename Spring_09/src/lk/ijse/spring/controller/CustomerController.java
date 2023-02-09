package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")

public class CustomerController {
    public CustomerController(){
        System.out.println("Customer Controller");
    }
//    @GetMapping
//    public void callMe(){
//        System.out.println("Call Me Method Invoked");
//    }
    @GetMapping
    public String testOne(){
        return "Hello I am Sithum";
    }
}
