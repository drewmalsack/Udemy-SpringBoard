package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a defualt constructor
	public TennisCoach () {
		System.out.println(">> inside default constructor.");
	}
	
	/* setter injection code
	// define a setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: inside doStuffFotuneService method.");
		fortuneService = theFortuneService;
	}
	*/
	
	/* constructor injection code
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkout() {
		return "Practice Kick Serve";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
