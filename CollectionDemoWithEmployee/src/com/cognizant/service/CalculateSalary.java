package com.cognizant.service;

import java.util.List;

import com.cognizant.pojo.Employee;

public class CalculateSalary {

	public void calculateNetSalary(List<Employee> eList) {

		for(Employee em : eList) {
		em.setTds(em.getBasicSalary() * 0.1);
		em.setPf(em.getBasicSalary() * 0.025);
		em.setNetSalary(em.getBasicSalary() - em.getTds() - em.getPf());
		}
	
	}

}
