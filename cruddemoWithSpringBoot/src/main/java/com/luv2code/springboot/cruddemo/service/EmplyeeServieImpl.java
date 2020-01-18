package com.luv2code.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springboot.cruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.cruddemo.entity.Employee;
@Service
public class EmplyeeServieImpl implements EmployeeService {

	private EmployeeDAO employeeDAO;
	@Autowired
	public EmplyeeServieImpl(EmployeeDAO theEmployeeDAO)
	{
		employeeDAO=theEmployeeDAO;
	}
	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theID) {
		
		return employeeDAO.findById(theID);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);

	}

	@Override
	@Transactional
	public void deletebyID(int theID) {
		employeeDAO.deleteById(theID);
	}

}
