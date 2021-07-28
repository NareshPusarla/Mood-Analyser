package com.bridgelabz.regex;

public class MoodAnalyser {
	public String message;
	
	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public void analyseMood(String message) {
		if(this.message.equals("I am in Sad Mood")) {
			System.out.println("SAD");
		}
		else{
			System.out.println("Happy");
		}
	}
}
