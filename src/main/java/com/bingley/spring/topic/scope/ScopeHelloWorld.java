package com.bingley.spring.topic.scope;

import java.util.ArrayList;
import java.util.List;

public class ScopeHelloWorld {
	/**
	 * 该list是一个共享的数据
	 */
	private List<String> stringS = new ArrayList<String>();
	public List<String> getStringS() {
		return stringS;
	}
	public void setStringS(List<String> stringS) {
		this.stringS = stringS;
	}
	public ScopeHelloWorld(){
		System.out.println("++++++++++++");
	}
	public void hello(){
		System.out.println("hello");
	}
}
