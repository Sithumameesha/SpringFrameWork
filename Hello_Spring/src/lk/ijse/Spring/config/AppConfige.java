package lk.ijse.Spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfige {

        public AppConfige(){
            System.out.println("AppConfig:Instantiated");
        }
}

