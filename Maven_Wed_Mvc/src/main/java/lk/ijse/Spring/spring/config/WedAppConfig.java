package lk.ijse.Spring.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"lk.ijse.Spring.spring.controller","lk.ijse.Spring.spring.Adviser"})
public class WedAppConfig {
@Bean
    public ModelMapper modelMapper(){
    return new ModelMapper();
}
}
