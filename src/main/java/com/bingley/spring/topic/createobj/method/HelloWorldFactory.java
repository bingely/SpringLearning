package com.bingley.spring.topic.createobj.method;

import com.bingley.spring.topic.createobj.when.WhenHelloWorld;

public class HelloWorldFactory {
    public static HelloWorld getInstance() {
        return new HelloWorld();
    }

    public HelloWorld getIns() {
        return new HelloWorld();
    }
}
