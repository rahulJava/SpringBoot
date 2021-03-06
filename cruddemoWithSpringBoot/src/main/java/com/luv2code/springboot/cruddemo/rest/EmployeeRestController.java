package com.luv2code.springboot.cruddemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeService;

@RestController
@RequestMapping("/api")
//this is something we need to check
public class EmployeeRestController {

	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeRestController(EmployeeService theEmployeeService)
	{
		employeeService=theEmployeeService;
	} 
	
	@GetMapping("/employees")
	public List<Employee> findAll()
	{
		return employeeService.findAll();
	}
	
	@GetMapping("/employees/{employeeID}")
	public Employee findbyID(@PathVariable int employeeID)
	{
		System.out.println("Inside line 35");
		 Employee theEmployee=employeeService.findById(employeeID);
		 if(theEmployee==null)
		 {
			 throw new RuntimeException("Employee ID not found :"+employeeID);
		 }
		 return theEmployee;
	}
	@PutMapping("/employees")
	public Employee updateByID(@RequestBody Employee  employee)
	{
		System.out.println("Inside line 35");
		// employee.setId(0);
		 employeeService.save(employee);
		 return employee;
	}
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		//employee.setId(0);
		employeeService.save(employee);
		 return employee;
	}
	@DeleteMapping("/employees/{employeeID}")
	public String deleteEmployee(@PathVariable int employeeID)
	{
		Employee theEmployee = employeeService.findById(employeeID);
		if(theEmployee==null)
		{
			throw new RuntimeException("Employee not Found : "+employeeID);
		}
		employeeService.deletebyID(employeeID);
		return "Deleted employee ID :"+employeeID;
	}
}
