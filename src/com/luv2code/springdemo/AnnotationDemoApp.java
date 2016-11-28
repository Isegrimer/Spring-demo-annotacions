package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read Spring config File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//get the bean from spring Container
		
		Coach theCoach =  context.getBean("tennisCoach" , Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//close the context
		context.close();
	}

}
