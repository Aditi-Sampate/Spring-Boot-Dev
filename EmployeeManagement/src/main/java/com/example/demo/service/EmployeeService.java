package com.example.demo.service;

import com.example.demo.entity.Employee;

public class EmployeeService {

	
	public String saveEmployee(Employee employee)
	{
		return "Employee Saved in Database";
	}
	
	
	
	public Employee getEmployee()
	{
		Employee E1 =  new Employee();
		
		E1.seteName("Gatha");
		E1.seteAddress("Latur");
		E1.seteId(1234);
		E1.seteDept("IT");
		E1.seteMobNo(1324556765);
		
		return E1;
		
	}
	
}
