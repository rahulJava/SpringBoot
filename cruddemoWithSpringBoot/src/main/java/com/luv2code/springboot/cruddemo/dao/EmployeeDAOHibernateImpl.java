package com.luv2code.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

	
	private EntityManager entityManager;
	
	@Autowired
	public  EmployeeDAOHibernateImpl(EntityManager theEntityManager)
	{
		entityManager=theEntityManager;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		Session currentSession = entityManager.unwrap(Session.class);
		
		
		//create a query
		
		Query<Employee> theQuery= currentSession.createQuery("from Employee",Employee.class);
		
		List<Employee> theEmployees=theQuery.list();
		return theEmployees;
	}
	@Override
	public Employee findById(int theID) {
		Session currentSession = entityManager.unwrap(Session.class);
		Employee theEmployee = currentSession.get(Employee.class,theID);
		
		return theEmployee;
	}
	@Override
	public void save(Employee theEmployee) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(theEmployee);
		
	}
	@Override
	public void deleteById(int theID) {
		
		Session currentSession = entityManager.unwrap(Session.class);
		Employee theEmployee = currentSession.get(Employee.class,theID);
		currentSession.delete(theEmployee);
	}
	

}
