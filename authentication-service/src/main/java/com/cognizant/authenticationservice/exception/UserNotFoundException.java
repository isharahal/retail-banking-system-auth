package com.cognizant.authenticationservice.exception;

public class UserNotFoundException extends Exception{
	private static final long serialVersionUID = 1L;
	public UserNotFoundException() {
		super();
	}
	public UserNotFoundException(final String message) {
		super(message);
	}
}
