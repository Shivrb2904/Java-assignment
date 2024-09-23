package com.cg.eis.service;

import java.util.Scanner;
import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {
    private Scanner scanner = new Scanner(System.in);
    
    @Override
    public void getEmployeeDetails() {
        System.out.println("Enter Employee ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        System.out.println("Enter Employee Name:");
        String name = scanner.nextLine();
        
        System.out.println("Enter Employee Salary:");
        double salary = scanner.nextDouble();
        
        System.out.println("Enter Employee Designation:");
        String designation = scanner.next();
        
        Employee employee = new Employee(id, name, salary, designation);
        findInsuranceScheme(employee);
        displayEmployeeDetails(employee);
    }

    @Override
    public void findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();
        String scheme;

        if (salary < 5000 && designation.equalsIgnoreCase("Clerk")) {
            scheme = "No Scheme";
        } else if (salary >= 5000 && salary < 20000 && designation.equalsIgnoreCase("System Associate")) {
            scheme = "Scheme C";
        } else if (salary >= 20000 && salary < 40000 && designation.equalsIgnoreCase("Programmer")) {
            scheme = "Scheme B";
        } else if (salary >= 40000 && designation.equalsIgnoreCase("Manager")) {
            scheme = "Scheme A";
        } else {
            scheme = "No Scheme";
        }
        employee.setInsuranceScheme(scheme);
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        employee.displayDetails();
    }
}

