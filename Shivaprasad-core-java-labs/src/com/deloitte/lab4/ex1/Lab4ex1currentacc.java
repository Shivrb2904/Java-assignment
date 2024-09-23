package com.deloitte.lab4.ex1;

public class Lab4ex1currentacc extends Lab4ex1account {
    private double overdraftLimit = 10000; // Overdraft limit

    // Constructor
    public Lab4ex1currentacc(Lab4ex1person accHolder, double balance) {
        super(accHolder, balance);
    }

    // Override withdraw to check overdraft limit
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println(amount + " withdrawn from current account. Updated Balance: INR " + balance);
        } else {
            System.out.println("Withdrawal failed. Overdraft limit of INR " + overdraftLimit + " reached.");
        }
    }
}
