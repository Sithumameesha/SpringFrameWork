package lk.ijse.Spring.config;

import lk.ijse.Spring.pojo.BaicsDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.Spring")
public class AppConfige {

        public AppConfige(){
            System.out.println("AppConfig:Instantiated");
        }
        @Bean
    public BaicsDataSource baicsDataSource(){
            return new BaicsDataSource();
        }
}

