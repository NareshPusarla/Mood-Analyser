package com.bridgelabz.regex;

public class MoodCustomException extends Exception {
	String response;

	public MoodCustomException(String response) {
		super(response);
	}
}
