package com.bridgelabz.regex;

public class MoodAnalyser {
	public String message;
	public void analyseMood(String message) {
		if(message.equals("I am in Sad Mood")) {
			System.out.println("SAD");
		}
		else if(message.equals("I am in Any Mood")) {
			System.out.println("Happy");
		}
	}
}
