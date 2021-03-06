package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
	
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if the 2 coaches point to the same object
		boolean result = (theCoach == alphaCoach);
		
		System.out.println("\n pointing to the same object: "+result);
		
		System.out.println("\n Memory location for theCoach: "+theCoach);
		
		System.out.println("\n Memory location for alphaCoach: "+alphaCoach+"\n");
		
		// close context
		context.close();
	}

}
