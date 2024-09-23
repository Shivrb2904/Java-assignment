package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
    void getEmployeeDetails();
    void findInsuranceScheme(Employee employee);
    void displayEmployeeDetails(Employee employee);
}
