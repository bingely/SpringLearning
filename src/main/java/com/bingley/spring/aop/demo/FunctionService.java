package com.bingley.spring.aop.demo;

import org.springframework.stereotype.Service;

 /**
   * 
   * Author:  Mr.bingley
   * Version: 
   * Date:  2017/6/9
   */

 // @Service注解表示这个类属于Service层，并且是由Spring管理的一个类。
 // 当然这里也可以选用@Repository、@Component、@Controller注解，效果相同。实际应用中根据相关类所处的位置选用合适的注解。
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "你好 " + word + " !";
    }
}
