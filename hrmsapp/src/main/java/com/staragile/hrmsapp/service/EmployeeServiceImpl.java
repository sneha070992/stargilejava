package com.staragile.hrmsapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staragile.hrmsapp.dao.EmployeeRepository;
import com.staragile.hrmsapp.data.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository empRepo;
	@Override
	public Employee addEmployee(Employee employee) {
		
		return empRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		Optional<Employee> emp = empRepo.findById(employeeId);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			return null;
		}
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Optional<Employee> emp = empRepo.findById(employee.getEmpId());
		if(emp.isPresent()) {
			Employee empl = emp.get();
			empl.setEmpName(employee.getEmpName());
			empl.setSalary(employee.getSalary());
			empl.setDateOfBirth(employee.getDateOfBirth());
			//empl.setAddress(employee.getAddress());
			
			return empRepo.save(empl);
		}else {
			return employee;
		}

	}

	@Override
	public String deleteEmployeeById(Integer employeeId) {
		empRepo.deleteById(employeeId);
		return "Deleted Successfully";
	}

}
