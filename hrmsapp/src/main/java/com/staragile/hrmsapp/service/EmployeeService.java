package com.staragile.hrmsapp.service;

import com.staragile.hrmsapp.data.Employee;

public interface EmployeeService {
	
	//Create
	public Employee addEmployee(Employee employee);
	//Retrieve
	public Employee getEmployeeById(Integer employeeId);
	//Update
	public Employee updateEmployee(Employee employee);
	//Delete
	public String deleteEmployeeById(Integer employeeId);
}
