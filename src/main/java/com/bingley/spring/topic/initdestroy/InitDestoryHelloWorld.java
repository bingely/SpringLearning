package com.bingley.spring.topic.initdestroy;

public class InitDestoryHelloWorld {
	public InitDestoryHelloWorld(){
		System.out.println("88888888888");
	}
	
	public void init(){
		System.out.println("init");
	}
	
	public void destroy(){
		System.out.println("destroy");
	}
	
	public void hello(){
		System.out.println("hello");
	}
}
