package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create array of strings
	private String[] data = {
			"Beware low luck day",
			"Keep going, luck is up to you today",
			"Good luck, try many things"
	};
	
	// create random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from array
		String fortune = data[myRandom.nextInt(data.length)];
		
		return fortune;
	}

}
