package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @PostMapping
    public void SaveCustomer(){
        System.out.println("Wade Hri");
    }
}
