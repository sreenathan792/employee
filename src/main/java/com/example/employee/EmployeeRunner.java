package com.example.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import com.example.employee.service.EmployeeService;

@Component
public class EmployeeRunner implements CommandLineRunner {
 
	private static final Logger log = 
			LoggerFactory.getLogger(EmployeeRunner.class);
	
	@Autowired
	EmployeeService empServ;
	
	@Autowired
	EmployeeRepository empRep;
	
	@Override
	public void run(String... arg0) throws Exception {
		Employee emp = new Employee(1L, "Jack", 25);
		empRep.saveEmployee(emp);
		
		log.info("Inserted 1 rec");
		
//		emp = new Employee(2L, "Jill", 30);
//		empServ.insert(emp);
//		
//		emp = new Employee(3L, "Sam", 23);
//		empServ.insert(emp);
		
	}
}
