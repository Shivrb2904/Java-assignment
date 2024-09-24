package com.cg.eis.bean;

//File: EmployeeSalaryValidator.java
//Package: Default (or you can define another package if required)

import com.cg.eis.exception.EmployeeException; // Import the custom exception

//Class to validate employee salary
public class Lab5Ex3 {
 private String employeeName;
 private double salary;

 // Constructor
 public Lab5Ex3(String employeeName, double salary) {
     this.employeeName = employeeName;
     this.salary = salary;
 }

 // Method to validate salary
 public void validateSalary() throws EmployeeException {
     if (salary < 3000) {
         throw new EmployeeException("Salary is below 3000. Salary provided: " + salary);
     } else {
         System.out.println("Employee " + employeeName + " has a valid salary: " + salary);
     }
 }

 // Main method to test the salary validation
 public static void main(String[] args) {
     try {
         // Create an EmployeeSalaryValidator object with a salary below 3000
    	 Lab5Ex3 employee = new Lab5Ex3("John Doe", 2500);

         // Validate the employee's salary
         employee.validateSalary();
     } catch (EmployeeException e) {
         // Handle the EmployeeException and display the error message
         System.out.println("Exception caught: " + e.getMessage());
     }

     // Another test case with a valid salary
     try {
    	 Lab5Ex3 employee2 = new Lab5Ex3("Shiv R B", 5678);
         employee2.validateSalary();
     } catch (EmployeeException e) {
         System.out.println("Exception caught: " + e.getMessage());
     }
 }
}
