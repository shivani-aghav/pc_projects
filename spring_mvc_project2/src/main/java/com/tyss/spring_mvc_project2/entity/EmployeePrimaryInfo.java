package com.tyss.spring_mvc_project2.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "emp_Table")
public class EmployeePrimaryInfo {
	@Id
	private String empId;
	private String empName;
	private String empEmail;
	private String empPassword;
}
