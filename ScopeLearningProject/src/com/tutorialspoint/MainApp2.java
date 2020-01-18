package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp2 {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
		//there is a bean called HelloWorld which is its id, its value is different
		
		
		HelloWorld2 obj = (HelloWorld2) context.getBean("Singleton");
		obj.setMessage("Instead of a bean saying what the message is, this object is doing it.");
		obj.getMessage();
		
		HelloWorld2 objPair = (HelloWorld2) context.getBean("Singleton");
		
		objPair.getMessage();
		
		
		HelloWorld2 obj2 = (HelloWorld2) context.getBean("Prototype");
		obj2.getMessage();
		
		
	}

}
