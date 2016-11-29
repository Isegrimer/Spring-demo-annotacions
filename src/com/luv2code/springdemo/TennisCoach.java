package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("ramdomFortuneService")
	private FortuneService fortuneService;
	
	
	/* 
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}*/
	
	
	//defaul constructor 
		public TennisCoach() {
			System.out.println(">> Inside Default Constructor");
		}
		
		
		// define my init method
		@PostConstruct
		public void doMyStartupStuff(){
			System.out.println(">> TennisCoach : inside of doMyStartupStuff");
		}
		
		//define my destroy method
		@PreDestroy
		public void doMyDestroyStuff(){
			System.out.println(">> TennisCoach : inside of doMyDestroyStuff");
		}
		
		
		
		
		/*
		//define a setter method 
		@Autowired
		public void setFortuneService(FortuneService theFortuneService) {
			System.out.println(">> Tennis Coach inside setFortuneService");
			this.fortuneService = theFortuneService;
		}
		*/



	@Override
	public String getDailyWorkOut() {
		
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
