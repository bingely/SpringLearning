package main.com.bingley.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.com.bingley.spring.aop.MyConfig;
import main.com.bingley.spring.aop.UseFunctionService;

/**
 * Created by SAM on 2017/6/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        System.out.println(bean.sayHello("sang"));
        context.close();
    }
}
