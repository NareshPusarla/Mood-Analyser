package com.bridgelabz.regex;

import java.util.Scanner;

public class MoodAnalyser {
	public static String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the message: ");
		message = sc.next();
		MoodAnalyser md = new MoodAnalyser(message);
		try {
			md.analyseMood();
		} catch (MoodCustomException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Executed");
	}

	public void analyseMood() throws MoodCustomException {
		if (this.message.equals("sad")) {
			System.out.println("I am in Sad Mood");
		} else if (this.message.equals("happy")) {
			System.out.println("I am in Happy Mood");
		}
		else{
			throw new MoodCustomException("Message can't be null or invalid , so try happy or sad.");
		}
	}
}
