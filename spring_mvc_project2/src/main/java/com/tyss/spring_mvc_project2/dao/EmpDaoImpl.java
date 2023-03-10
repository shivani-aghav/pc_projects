package com.tyss.spring_mvc_project2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.tyss.spring_mvc_project2.entity.EmployeePrimaryInfo;

@Repository
public class EmpDaoImpl implements EmpDao {

	private boolean isBoolean = false;

	@Override
	public boolean register(EmployeePrimaryInfo employeePrimaryInfo) {

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();

			entityManager.persist(employeePrimaryInfo);

			entityTransaction.commit();
			isBoolean = true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return isBoolean;
	}

	@Override
	public EmployeePrimaryInfo authenticate(EmployeePrimaryInfo employeePrimaryInfo) {
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EmployeePrimaryInfo employee2 = entityManager.find(EmployeePrimaryInfo.class,
					employeePrimaryInfo.getEmpId());
			if (employee2 != null) {
				if (employeePrimaryInfo.getEmpPassword().equals(employee2.getEmpPassword())) {
					return employee2;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
