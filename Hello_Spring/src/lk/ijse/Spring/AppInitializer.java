package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfige;
import lk.ijse.Spring.pojo.pojoTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfige.class);
        ctx.refresh();

        //Context Invocation
        pojoTwo c1 = ctx.getBean(pojoTwo.class);
        System.out.println(c1);
        c1.Name();

        ctx.close();
    }

}
