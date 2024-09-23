package com.deloitte.lab4.ex1;

public class Lab4ex1 {
    public static void main(String[] args) {
        // Create Person objects
    	Lab4ex1person smith = new Lab4ex1person("Smith", 30);
    	Lab4ex1person kathy = new Lab4ex1person("Kathy", 28);

    	Lab4ex1savingacc smithAccount = new Lab4ex1savingacc(smith, 2000);
    	Lab4ex1currentacc kathyAccount = new Lab4ex1currentacc(kathy, 3000);

        // Display initial balances
        System.out.println("Initial Balance of Smith: INR " + smithAccount.getBalance());
        System.out.println("Initial Balance of Kathy: INR " + kathyAccount.getBalance());

        // Deposit INR 2000 to Smith's account
        smithAccount.deposit(2000);

        // Withdraw INR 2000 from Kathy's account
        kathyAccount.withdraw(2000);

        // Display updated balances
        System.out.println("Updated Balance of Smith: INR " + smithAccount.getBalance());
        System.out.println("Updated Balance of Kathy: INR " + kathyAccount.getBalance());

        // Test minimum balance enforcement for savings account
        smithAccount.withdraw(4000); // This should fail because of minimum balance requirement

        // Test overdraft limit enforcement for current account
        kathyAccount.withdraw(12000); // This should fail because overdraft limit is exceeded
    }
}

