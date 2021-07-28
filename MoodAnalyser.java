package com.bridgelabz.regex;

public class MoodAnalyser {
	public String message;
	public void analyseMood(String message) {
		if(message.equals("Happy")) {
			System.out.println("Happy Mood");
		}
		else {
			System.out.println("Sad Mood");
		}
	}
}
