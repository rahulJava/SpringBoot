package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
@Service("employeeServiceImpl")
public class EmplyeeServieImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAOJpaImpl;

	
	//@Autowired
//	public EmplyeeServieImpl(EmployeeDAO theEmployeeDAO)
	//{
	//	employeeDAOJpaImpl=theEmployeeDAO;
	//}
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAOJpaImpl.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theID) {
		
		return employeeDAOJpaImpl.findById(theID);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAOJpaImpl.save(theEmployee);

	}

	@Override
	@Transactional
	public void deletebyID(int theID) {
		employeeDAOJpaImpl.deleteById(theID);
	}

}
