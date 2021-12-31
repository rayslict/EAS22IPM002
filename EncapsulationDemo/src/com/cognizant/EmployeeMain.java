package com.cognizant;

import java.util.Scanner;

import com.cognizant.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Enter Employee ID : ");
		employee.setEmpId(scanner.nextInt());
		System.out.println("Enter Employee Name : ");
		employee.setEmpName(scanner.next());
		System.out.println("Enter Employee Age : ");
		employee.setAge(scanner.nextInt());
		System.out.println("Enter Employee Salary : ");
		employee.setSalary(scanner.nextDouble());
		
		
		System.out.println("Employee ID : "+employee.getEmpId());
		System.out.println("Employee Name : "+employee.getEmpName());
		System.out.println("Employee Age : "+employee.getAge());
		System.out.println("Employee Salary : "+employee.getSalary());
		
		System.out.println("***** Using toString() with Object *********");
		System.out.println(employee.toString());
		
		System.out.println("***** Using toString() without Object *********");
		System.out.println(employee);
		
		
		

	}

}
