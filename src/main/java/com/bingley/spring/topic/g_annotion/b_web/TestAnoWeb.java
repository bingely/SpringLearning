package com.bingley.spring.topic.g_annotion.b_web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnoWeb {

	/**
	 * 理清这之间的关系
	 *
	 * web(control) 去找service，service去找dao
	 */
	@Test
	public void demo02(){
		//从spring容器获得
		String xmlPath = "com/bingley/spring/topic/g_annotion/b_web/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		StudentAction studentAction = (StudentAction) applicationContext.getBean("studentActionId");

		studentAction.execute();
		
	}

}
