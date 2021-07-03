package com.techelevator;

public class CustomerAccount {

    private double balance = 4000;

    public double deposit(int amountToDeposit) {
        balance = balance + amountToDeposit;
        return balance;
    }

    public double withdraw(double amountToWithdraw) {
        balance = balance - amountToWithdraw;
        return balance;

    }

    public double getBalance() {
        return balance;
    }
}
