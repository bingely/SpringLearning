package main.com.bingley.spring.aop;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * .编写拦截规则的注解
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/6/9
 */
//这就是一个普通的注解，@Target一行表示该注解将作用在方法上
// @Retention一行表示该注解将一直保存到运行时，@Documented表示该注解将保存在javadoc中。

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}