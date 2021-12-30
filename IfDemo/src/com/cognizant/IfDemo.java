package com.cognizant;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		
		if(age>=18) {
			System.out.println("Eligible for vote....");
		}else {
			System.out.println("Not Eligible...");
		}

	}

}
