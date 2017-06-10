package com.bingley.spring.el;

import com.bingley.spring.utils.MyConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by SAM on 2017/6/8.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ScopeTest bean1 = context.getBean(ScopeTest.class);
        ScopeTest bean2 = context.getBean(ScopeTest.class);
        System.out.println(bean1.equals(bean2));
        context.close();
    }
}
