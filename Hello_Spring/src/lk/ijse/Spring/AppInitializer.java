package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfige;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfige.class);
        ctx.refresh();
        ctx.close();
    }

}
