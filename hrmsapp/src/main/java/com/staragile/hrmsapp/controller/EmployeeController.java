package com.staragile.hrmsapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.staragile.hrmsapp.data.Employee;
import com.staragile.hrmsapp.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	//Create
	//http://localhost:8080/addemployee
	@PostMapping("/addemployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		return empService.addEmployee(employee);
	}
	//Retrieve
	//http://localhost:8080/getemployeebyid/1
	@GetMapping("/getemployeebyid/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") Integer empId) {
		Employee emp;
		
		emp= empService.getEmployeeById(empId);
		return emp;
	}
	//Update
	//Delete
	//http://localhost:8080/deleteemployeebyid/2
	@DeleteMapping("/deleteemployeebyid/{empId}")
	public String deleteEmployeeById(@PathVariable("empId") Integer empId){
		return empService.deleteEmployeeById(empId);
		
	}
	
}
