package lk.ijse.spring.pojo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanOne implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

public SpringBeanOne(){
    System.out.println("Spring Bean:Instantiated");
}

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Spring BeanFactoryAware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Spring Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean Destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Content Aware");
    }
}
