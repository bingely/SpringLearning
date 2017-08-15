package com.bingley.spring.topic.g_annotion.c_other;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOther {
	
	@Test
	public void demo02(){
		//spring 工厂
		String xmlPath = "com/bingley/spring/topic/g_annotion/c_other/beans.xml";
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		UserService userService = applicationContext.getBean("userServiceId" ,UserService.class);
		UserService userService2 = applicationContext.getBean("userServiceId" ,UserService.class);
		
		System.out.println(userService);
		System.out.println(userService2);

		// close()掉才能触发销毁操作
		applicationContext.close();
	}

}
