package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//read Spring config File
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//get the bean from spring Container
		
		Coach theCoach =  context.getBean("tennisCoach" , Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//get method to get daily Fortune
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
