package com.cognizant.service;

import com.cognizant.pojo.Employee;

public class CalculateSalary {

	public void calculateNetSalary(Employee emp[]) {

		for(Employee em : emp) {
		em.setTds(em.getBasicSalary() * 0.1);
		em.setPf(em.getBasicSalary() * 0.025);
		em.setNetSalary(em.getBasicSalary() - em.getTds() - em.getPf());
		}
	
	}

}
