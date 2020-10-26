package com.example.employee.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	private Long employeeId;
	
	@Column(name = "employee_name")
	private String employeeName;
	
	@Column(name = "employee_age")
	private int employeeAge;
	
//	@OneToMany
//	@JoinColumn(name = "task_employee_id")
//	private List<Tasks> tasks;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

//	public List<Tasks> getTasks() {
//		return tasks;
//	}
//
//	public void setTasks(List<Tasks> tasks) {
//		this.tasks = tasks;
//	}

	public Employee(Long employeeId, String employeeName, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
			 + "]";
	}
	
}
