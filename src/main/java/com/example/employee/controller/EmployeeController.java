package com.example.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.entity.Employee;
import com.example.employee.service.EmployeeService;

@RestController
public class EmployeeController {
 
	@Autowired
	EmployeeService empService;
	
	@GetMapping(path = "/test")
	public String test() {
		return "test";
	}
	
	@GetMapping(path = "/employees")
	public List<Employee> getAllCountry() {
		List<Employee> employeeList = empService.getAllEmployee();
		return employeeList;
	}
	
	@PostMapping(path = "/saveTest")
	public void save(@RequestBody Employee employee) {
		empService.insert(employee);
	}
}


