package org.AbsterGo.jms.Service;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
	    context.start();
	    
	}
}
