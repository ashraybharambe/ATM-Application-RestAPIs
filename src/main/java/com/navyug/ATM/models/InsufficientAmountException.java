package com.navyug.ATM.models;

public class InsufficientAmountException extends Exception {
	
	public InsufficientAmountException(String s) {
		super(s);
	}

	public InsufficientAmountException() {
		super();
	}

	public InsufficientAmountException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public InsufficientAmountException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsufficientAmountException(Throwable cause) {
		super(cause); 
	}
	
}
