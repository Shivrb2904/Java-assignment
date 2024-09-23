package com.deloitte.lab4.ex1;

public class Lab4ex1savingacc extends Lab4ex1account {
    private final double minimumBalance = 500;

    // Constructor
    public Lab4ex1savingacc(Lab4ex1person accHolder, double balance) {
        super(accHolder, balance);
    }

    // Override withdraw to check for minimum balance
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println(amount + " withdrawn from savings account. Updated Balance: INR " + balance);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of INR " + minimumBalance + " must be maintained in savings account.");
        }
    }
}
