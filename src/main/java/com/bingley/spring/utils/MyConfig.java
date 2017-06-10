package com.bingley.spring.utils;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

 /**
   * 
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/6/9
   */

//@EnableAspectJAutoProxy表示开启Spring对AspectJ代理的支持。
@Configuration
@ComponentScan("com.bingley.spring")
@EnableAspectJAutoProxy
public class MyConfig {
}
