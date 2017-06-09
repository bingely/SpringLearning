package main.com.bingley.spring.el;

import org.springframework.context.annotation.Scope;

/**
   * 
   * Author:  Mr.bingley
   * Version: 
   * Date:  2017/6/9
   */

/*   Spring的Scope有如下几种：
        1.Singleton:表示该Bean是单例模式，在Spring容器中共享一个Bean的实例
        2.Prototype:每次调用都会新创建一个Bean的实例
        3.Request:这个是使用在Web中，给每一个http request新建一个Bean实例
        4.Session:这个同样是使用在Web中，表示给每一个http session新建一个Bean实例*/

@Scope("Singleton")
public class ScopeTest {
}
