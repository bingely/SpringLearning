package com.bingley.spring.aop;

import org.springframework.stereotype.Service;

/**
   * 使用注解被拦截
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/6/9
   */

 // Action代表？
 @Service
public class AnnotationService {

     @Action(name = "add-1")
     public void add1() {
         System.out.println("add-1");
     }

     public void add2() {
         System.out.println("add-2");

     }

     @Action(name = "add-3")
     public void add3() {
         System.out.println("add-3");
     }

}
