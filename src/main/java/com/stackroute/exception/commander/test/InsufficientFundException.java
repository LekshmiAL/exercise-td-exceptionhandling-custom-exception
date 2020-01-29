package com.stackroute.exception.commander.test;

public class InsufficientFundException extends Exception {

    private static final long serialVersionUID = 1L;

    public InsufficientFundException(String message) {
        super(message);
    }
}
