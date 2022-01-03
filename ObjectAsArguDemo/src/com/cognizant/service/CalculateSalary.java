package com.cognizant.service;

import com.cognizant.pojo.Employee;

public class CalculateSalary {
	
	public Employee calculateNetSalary(Employee emp) {
		
		emp.setTds(emp.getBasicSalary()*0.1);
		emp.setPf(emp.getBasicSalary()*0.025);
		emp.setNetSalary(emp.getBasicSalary()-emp.getTds()-emp.getPf());
		
		return emp;
	}

}
