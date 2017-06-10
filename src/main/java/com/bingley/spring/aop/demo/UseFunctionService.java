package com.bingley.spring.aop.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/6/9
 */

//@Service注解含义不再多说，
// @Autowired注解表示将FunctionService的实体Bean注入到UseFunctionService中，这里也可以使用上文提到的@Inject或者@Resource，效果相同。
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
