package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//@Entity
@Table(name = "tasks")
public class Tasks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long taskId;
	
	@Column(name = "task_name")
	private String taskName;
	
	@ManyToOne
	@JoinColumn(name = "task_employee_id")
	private Employee employee;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Tasks() {
	
	}

	public Tasks(Long taskId, String taskName, Employee employee) {
		super();
		this.taskId = taskId;
		this.taskName = taskName;
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Tasks [taskId=" + taskId + ", taskName=" + taskName + ", employee=" + employee + "]";
	}
	
}
