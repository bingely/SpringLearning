package com.bingley.spring.test;


import com.bingley.spring.topic.createobj.method.HelloWorld;
import com.bingley.spring.topic.createobj.when.WhenHelloWorld;
import com.bingley.spring.topic.a_ioc.alia.AliaHelloWorld;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CreateObjectTest {
	@Test
	public void testCreateObject(){
		/**
		 * 1、启动spring容器
		 * 2、从spring容器中把对象取出来
		 * 3、对象调用方法
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ApplicationContext context = new FileSystemXmlApplicationContext(new String[]{"G:\\github\\SpringLearning\\src\\main\\java\\applicationContext.xml"});
		HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
		helloWorld.hello();
	}

	@Test
	public void testCreateObjectMethod_Factory(){
		/**
		 * 1、启动spring容器
		 * 2、从spring容器中把对象取出来
		 * 3、对象调用方法
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld factory = (HelloWorld)context.getBean("aa");
		factory.hello();
	}

	@Test
	public void testAlias(){
		/**
		 * 1、启动spring容器
		 * 2、从spring容器中把对象取出来
		 * 3、对象调用方法
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AliaHelloWorld helloWorld = (AliaHelloWorld)context.getBean("王二麻子");
		helloWorld.hello();
	}

	@Test
	public void testWhen(){
		//如果lazy-init为"true",在context.getBean时才要创建对象
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("aa");
		WhenHelloWorld helloWorld = (WhenHelloWorld) context.getBean("helloWhen");
		helloWorld.hello();
	}
}
