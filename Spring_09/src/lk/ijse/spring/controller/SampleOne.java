package lk.ijse.spring.controller;

import lk.ijse.spring.Dto.CustomerDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@CrossOrigin
public class SampleOne {
    @PutMapping
    public void saveCustomer(@RequestBody CustomerDto dto){
        System.out.println(dto.toString());
    }
}
