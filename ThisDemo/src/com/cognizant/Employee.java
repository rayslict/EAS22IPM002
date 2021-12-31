package com.cognizant;

public class Employee {
	
	int id;
	String name;
	
	public Employee() {
		
		System.out.println("From Default Constr");
		
	}
	
	public Employee(int id, String name) {
		this();
		this.id=id;
		this.name=name;
		
	}
	
	public void displayEmployee() {
		System.out.println("Employee Id : "+id+"\t Employee Name : "+name);
	}

}
