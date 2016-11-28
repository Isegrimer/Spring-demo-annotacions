package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RamdomFortuneService implements FortuneService {

	//Create an Array of String
	private String[] data ={
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother od good lucky",
			"The Journy is the reward"};
	
	//create a Random number generator 
	private Random myRanmdom = new Random();
	
	@Override
	public String getFortune() {
		//pick a Random String for the Array
		int index= myRanmdom.nextInt(data.length);
		
		return data[index];
	}

}
