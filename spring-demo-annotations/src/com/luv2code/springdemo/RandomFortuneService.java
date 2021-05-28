package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	
	// create array of strings
	private ArrayList<String> data = new ArrayList<String>();
	
	// create random number generator
	private Random myRandom = new Random();
	
	@PostConstruct
	public void doStuff() {
		File file = new File("fortunes.txt");
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine())
			{
				data.add(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getDailyFortune() {
		// pick a random string from array
		String fortune = data.get(myRandom.nextInt(data.size()));
		
		return fortune;
	}

}
