package lk.ijse.Spring.config.pojo;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl {
//    public Girl(){
//        System.out.println("I am girl");
//    }
    public void Chat(){
        System.out.println("Hello Hii");
    }
}
