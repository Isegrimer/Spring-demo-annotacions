package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationBeanScopeDemoApp {

	public static void main(String agrs[]){
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theChoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if are the same
		boolean result = (theChoach==alphaCoach);
		
		//print out the result
		System.out.println("\nPointing to the same Object : "+ result);
		
		
		System.out.println("\nMemory location for  theChoach  : "+ theChoach);
		
		System.out.println("\nMemory location for  alphaCoach : "+ alphaCoach +"\n");
		
		//close context 
		context.close();
		
	}
}
