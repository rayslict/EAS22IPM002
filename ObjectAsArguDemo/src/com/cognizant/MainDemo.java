package com.cognizant;

import java.util.Scanner;

import com.cognizant.pojo.Employee;
import com.cognizant.service.CalculateSalary;

public class MainDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.print("Enter Employee ID : ");
		employee.setId(scanner.nextInt());
		System.out.print("Enter Employee Name : ");
		employee.setName(scanner.next());
		System.out.print("Enter Employee AGe : ");
		employee.setAge(scanner.nextInt());
		System.out.print("Enter Employee Basic Salary : ");
		employee.setBasicSalary(scanner.nextDouble());
		System.out.println("Employee Details Without Net Salary : \n"+employee);
		
		CalculateSalary salary = new CalculateSalary();
		Employee employee2 = salary.calculateNetSalary(employee);
		System.out.println("Employee Details With Net Salary : \n"+employee2);

	}

}
