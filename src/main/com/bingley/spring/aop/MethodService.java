package main.com.bingley.spring.aop;

import org.springframework.stereotype.Service;

/**
   * 使用方法规则被拦截
   * Author:  Mr.bingley
   * Version:
   * Date:  2017/6/9
   */
 @Service
 public class MethodService {
     public void add() {
         System.out.println("method-add()");
     }
 }
