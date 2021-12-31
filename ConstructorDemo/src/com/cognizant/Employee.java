package com.cognizant;

public class Employee {
	
	int id;
	public Employee() {
	
		System.out.println("From Default Constructor");
	}
	
	public Employee(String city) {
		
		System.out.println("From Param Constructor : "+city);
	}
	
	public void Employee() {   // Method
		System.out.println("From Void");
	}
	
	public void empMet() {
		System.out.println("Employee ID : "+id);
	}

}
