package com.bingley.spring.aop.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author:  Mr.bingley
 * Version:
 * Date:  2017/6/9
 */
//@Configuration表示该类是一个配置类，
// @ComponentScan表示扫描org.sang包下所有使用了@Service、@Controller、@Component、@Repository注解的类，并将之注册为Bean。
@Configuration
@ComponentScan("com.bingley.spring")
public class MyConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}