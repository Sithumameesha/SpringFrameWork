package lk.ijse.Spring.config.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Boy {

@Autowired
GoodGirl girl;

    public Boy(){
        System.out.println("I am Sithum Ameesha");
    }
    public void chatWithGirl(){
        //Girl girl = new Girl();      dont Create the object in spring
        girl.Chat();
    }


}
