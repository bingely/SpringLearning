package main.com.bingley.spring.aop.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by SAM on 2017/6/8.
 */

//这里我们使用AnnotationConfigApplicationContext来作为Spring容器，它的参数就是我们之前创建的配置类，
// 然后通过getBean方法来获取类的Bean，最后调用Bean中的方法。
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        System.out.println(bean.sayHello("sang"));
        context.close();
    }
}
