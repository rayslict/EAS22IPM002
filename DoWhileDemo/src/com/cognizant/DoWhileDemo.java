package com.cognizant;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int choice = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("From Do While Loop : "+a);
			a++;
			System.out.println("Do ypu want to Continue -->  1. Yes   \t   2.No");
			choice = scanner.nextInt();
		}while(choice==1);

	}

}
