package com.deloitte.lab4.ex1;

public class Lab4ex1account {
    private long accNum;
    protected double balance; // Protected so child classes can access
    private Lab4ex1person accHolder;
    private static long accNumCounter = 1000; // To auto-generate account number

    // Constructor
    public Lab4ex1account(Lab4ex1person accHolder, double balance) {
        this.accNum = ++accNumCounter;  // Auto-generate accNum
        this.balance = balance;
        this.accHolder = accHolder;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. Updated Balance: INR " + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (balance - amount >= 500) { // Ensuring minimum balance of INR 500
            balance -= amount;
            System.out.println(amount + " withdrawn. Updated Balance: INR " + balance);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of INR 500 must be maintained.");
        }
    }

    // Get Balance
    public double getBalance() {
        return balance;
    }

    // Getters and Setters
    public long getAccNum() {
        return accNum;
    }

    public void setAccHolder(Lab4ex1person accHolder) {
        this.accHolder = accHolder;
    }

    public Lab4ex1person getAccHolder() {
        return accHolder;
    }
}
