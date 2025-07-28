package com.arms.org.ExceptionHandler;

@SuppressWarnings("serial")
public class UsersNotFoundException extends RuntimeException {

	public UsersNotFoundException(String message) {
		super(message);
		
	}
	

}
