package com.example.employee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository empRep;
	
	@Transactional
	public List<Employee> getAllEmployee() {
		return empRep.getAllEmployees();
	}
	
	@Transactional
	public void insert (Employee e) {
		empRep.saveEmployee(e);
	}
}
