package com.luv2code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "It be a sad day my boi.";
	}

}
