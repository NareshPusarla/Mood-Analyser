package com.bridgelabz.regex;

import java.util.Scanner;

import com.bridgelabz.regex.MoodCustomException.ExceptionType;

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
		else if (this.message == null) {
			throw new MoodCustomException(ExceptionType.Null, "Message can't be null");
		}
		else if(this.message.isEmpty()){
			throw new MoodCustomException(ExceptionType.EmptyString, "Message can't be empty");
		}
	}
}
