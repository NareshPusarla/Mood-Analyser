package com.bridgelabz.regex;

public class MoodCustomException extends Exception {
	
	public ExceptionType type;

	public MoodCustomException(ExceptionType type, String response) {
		super(response);
		this.type = type;
	}
	
	public enum ExceptionType{
		Null, EmptyString
	}
}
