package com.tyss.spring_mvc_project2.service;

import com.tyss.spring_mvc_project2.entity.EmployeePrimaryInfo;

public interface EmpService {

	public boolean register(EmployeePrimaryInfo employeePrimaryInfo);

	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo);
}
