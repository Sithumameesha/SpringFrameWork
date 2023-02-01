package lk.ijse.spring.config;

import lk.ijse.spring.pojo.BaicsDataSource;
import lk.ijse.spring.pojo.PojoOne;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean
    public BaicsDataSource baicsDataSource(){
        return new BaicsDataSource();
    }
    @Bean
    public PojoOne pojoOne(){
        return new PojoOne();
    }
}
