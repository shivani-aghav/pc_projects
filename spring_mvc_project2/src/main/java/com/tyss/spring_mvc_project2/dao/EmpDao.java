package com.tyss.spring_mvc_project2.dao;

import com.tyss.spring_mvc_project2.entity.EmployeePrimaryInfo;

public interface EmpDao {

	public boolean register(EmployeePrimaryInfo employeePrimaryInfo);

	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employee);

}
