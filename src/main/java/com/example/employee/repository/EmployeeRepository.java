package com.example.employee.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.Employee;

@Repository
@Transactional
public class EmployeeRepository {

	@Autowired
	@PersistenceContext
	EntityManager em;
	
	public List<Employee> getAllEmployees() {
		List<Employee> list = em.createQuery("select employeeId, employeeName, employeeAge from Employee").getResultList();
		return list;
	}
	
	public Employee getEmployee(Long id) {
		return em.find(Employee.class, id);
	}
	
	public void saveEmployee(Employee emp) {
		em.persist(emp);
	}	
	
}
