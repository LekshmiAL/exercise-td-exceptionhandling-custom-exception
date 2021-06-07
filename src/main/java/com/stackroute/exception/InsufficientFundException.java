package com.stackroute.exception;

public class InsufficientFundException extends Exception{
	/**
	 * constructor
	 * @param exceptionMessage
	 */
	public InsufficientFundException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
