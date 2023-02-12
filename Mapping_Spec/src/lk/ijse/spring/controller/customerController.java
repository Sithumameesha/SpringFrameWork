package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class customerController {
    @PostMapping
public void SaveCustomer(){
    System.out.println("Wade Hri");
}

}
