package com.staragile.hrmsapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.staragile.hrmsapp.data.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
