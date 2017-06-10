package com.bingley.spring.createobject;

import com.bingley.spring.when.HelloWorld;

public class HelloWorldFactory {
    public static HelloWorld getInstance() {
        return new HelloWorld();
    }

    public HelloWorld getIns() {
        return new HelloWorld();
    }
}
