package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springboot.cruddemo.entity.Employee;
@Repository("employeeDAOJpaImpl")
public class EmployeeDAOJpaImpl implements EmployeeDAO {

	@Autowired
	private EntityManager entityManager;
	
	//@Autowired
	public EmployeeDAOJpaImpl(EntityManager theEntityManager)
	{
		entityManager=theEntityManager;
	}
	@Override
	public List<Employee> findAll() {
		
		Query theQuery = entityManager.createQuery("from Employee");
		
		List<Employee> employees=theQuery.getResultList();
		return employees;
	}

	@Override
	public Employee findById(int theID) {
		Employee theEmployee = entityManager.find(Employee.class, theID);
		 
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		
		Employee dbEmployee=entityManager.merge(theEmployee);
		
		

	}

	@Override
	public void deleteById(int theID) {
		 

	}

}
