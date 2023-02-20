package lk.ijse.Spring.spring.controller;

import lk.ijse.Spring.spring.Dto.CustomerDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {
    @PostMapping
    public void SaveCustomer(CustomerDto dto){
        System.out.println("Wade Hri");
        System.out.println(dto.toString());
    }
}
