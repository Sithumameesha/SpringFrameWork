package lk.ijse.Spring;

import lk.ijse.Spring.config.AppConfige;
import lk.ijse.Spring.pojo.BaicsDataSource;
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
        BaicsDataSource b1 = ctx.getBean(BaicsDataSource.class);
        BaicsDataSource b2 = ctx.getBean(BaicsDataSource.class);
        System.out.println(b1);
        System.out.println(b2);
        //c1.Name();
        BaicsDataSource b3 = (BaicsDataSource) ctx.getBean("baicsDataSource");
        System.out.println(b3);


        //we cannt involked be method when ctx close

//Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//    @Override
//    public void run() {
//        System.out.println("hooking prosess shotdown ");
//        ctx.close();
//    }
//}));

        ctx.registerShutdownHook();
    }

}
