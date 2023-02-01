package lk.ijse.spring.pojo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PojoOne {
    public PojoOne(){
        System.out.println("Hello Pojo");
    }
}
