package lk.ijse.Spring.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.Spring.spring.controller"})
public class WedAppConfig {
    public WedAppConfig(){
        System.out.println("WedRoot:Instantiated");
    }
}
