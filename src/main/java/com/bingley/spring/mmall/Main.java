package com.bingley.spring.mmall;

import com.bingley.spring.aop.demo.UseFunctionService;
import com.bingley.spring.utils.MyConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


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
