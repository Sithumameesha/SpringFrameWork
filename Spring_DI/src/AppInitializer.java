import lk.ijse.Spring.config.confige.config;
import lk.ijse.Spring.config.pojo.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(config.class);
        ctx.refresh();
        ctx.registerShutdownHook();
        Boy boy = ctx.getBean(Boy.class);
        System.out.println(boy);
        boy.chatWithGirl();
    }
}
