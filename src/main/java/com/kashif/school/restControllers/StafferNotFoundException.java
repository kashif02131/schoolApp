package com.kashif.school.restControllers;

public class StafferNotFoundException extends RuntimeException{

	public StafferNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public StafferNotFoundException(String message) {
		super(message);
	}

	public StafferNotFoundException(Throwable cause) {
		super(cause);
	}
	
	

}
