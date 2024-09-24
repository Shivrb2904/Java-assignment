package com.cg.eis.pl;

import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class Lab4ex2 {
    public static void main(String[] args) {
        // Create EmployeeService object to use the methods
        EmployeeService employeeService = new EmployeeServiceImpl();
        
        // Get Employee details from user and process
        employeeService.getEmployeeDetails();
    }
}
