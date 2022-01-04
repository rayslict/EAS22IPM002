package com.cognizant;

import java.util.Scanner;

import com.cognizant.pojo.Employee;
import com.cognizant.service.CalculateSalary;

public class MainDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many Employees Net Salary do you want to Calculate :");
		int n= scanner.nextInt();
		Employee employee[] = new Employee[n];
		
		for(int i=0;i<employee.length;i++) {
			employee[i] = new Employee();
		System.out.print("Enter Employee ID : ");
		employee[i].setId(scanner.nextInt());
		System.out.print("Enter Employee Name : ");
		employee[i].setName(scanner.next());
		System.out.print("Enter Employee AGe : ");
		employee[i].setAge(scanner.nextInt());
		System.out.print("Enter Employee Basic Salary : ");
		employee[i].setBasicSalary(scanner.nextDouble());
		}
		
		
		CalculateSalary salary = new CalculateSalary();
		salary.calculateNetSalary(employee);
		for(Employee emp : employee) {
			System.out.println(emp);
		}		
	}

}
