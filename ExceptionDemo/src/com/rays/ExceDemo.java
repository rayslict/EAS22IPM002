package com.rays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceDemo {

	public static void main(String[] args) throws IOException {

		System.out.println("Main Starts Here");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Numbers: ");

		try {
			int a = Integer.parseInt(br.readLine()); 	// Unhandled exception type IOException
			int b = Integer.parseInt(br.readLine());
			int c = a / b; 								// ArithmeticException divided by 0
			System.out.println("Answer : " + c);
		} catch (Exception e) {
			System.out.println("In Catch Block");
			System.out.println("Printing Exception Object: "+e);
			System.out.println("Printing Exception Message : "+e.getMessage());
			System.out.println("Printing Exception Class : "+e.getClass());
		}

		System.out.println("Rest of the Codes......");
		System.out.println("Main Ends Here");

	}

}
