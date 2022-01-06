package com.cognizant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cognizant.pojo.Employee;
import com.cognizant.service.CalculateSalary;

public class MainDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many Employees Net Salary do you want to Calculate :");
		int n= scanner.nextInt();
		List<Employee> empList = new ArrayList<Employee>();
		
		for(int i=0;i<3;i++) {
			Employee employee = new Employee();
		System.out.print("Enter Employee ID : ");
		employee.setId(scanner.nextInt());
		System.out.print("Enter Employee Name : ");
		employee.setName(scanner.next());
		System.out.print("Enter Employee AGe : ");
		employee.setAge(scanner.nextInt());
		System.out.print("Enter Employee Basic Salary : ");
		employee.setBasicSalary(scanner.nextDouble());
		empList.add(employee);
		}
		
		
		CalculateSalary salary = new CalculateSalary();
		salary.calculateNetSalary(empList);
		for(Employee emp : empList) {
			System.out.println(emp);
		}		
	}

}
