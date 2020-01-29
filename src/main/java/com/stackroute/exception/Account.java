package com.stackroute.exception;

public class Account {

    private double accountBalance;

    public Account() {
        accountBalance = 0;
    }

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double withdraw(double amount) throws InsufficientFundException, NegativeIntegerException {
        if (amount < 0) {
            throw new NegativeIntegerException("Amount has to be greater tha zero");
        }
        if (amount >= accountBalance) {
            throw new InsufficientFundException("Insufficient Funds");
        } else {
            accountBalance -= amount;
        }
        return accountBalance;
    }

}
