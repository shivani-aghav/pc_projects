package com.tyss.spring_mvc_project2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.spring_mvc_project2.dao.EmpDao;
import com.tyss.spring_mvc_project2.entity.EmployeePrimaryInfo;

@Service
public class EmpServiceImpl implements EmpService {
	@Autowired
	private EmpDao dao;

	@Override
	public boolean register(EmployeePrimaryInfo employeePrimaryInfo) {
		if (employeePrimaryInfo.getEmpId().startsWith("TYC")) {

			return dao.register(employeePrimaryInfo);
		}
		return false;
	}

	@Override
	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo) {
		if (employeePrimaryInfo.getEmpId().startsWith("TYC")) {
			return dao.authenticate(employeePrimaryInfo);

		}
		return null;
	}

}
