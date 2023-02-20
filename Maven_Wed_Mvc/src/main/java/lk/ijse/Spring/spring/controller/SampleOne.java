package lk.ijse.Spring.spring.controller;

import lk.ijse.Spring.spring.Dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class SampleOne {
    @PutMapping
    public void saveCustomer(@RequestBody CustomerDto dto){
        System.out.println(dto.toString());
    }
}
