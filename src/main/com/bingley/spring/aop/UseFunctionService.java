package main.com.bingley.spring.aop;

import main.com.bingley.spring.aop.FunctionService;

/**
 * Created by SAM on 2017/6/8.
 */
public class UseFunctionService {
    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
