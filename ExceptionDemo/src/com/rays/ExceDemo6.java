package com.rays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceDemo6 {

	public static void main(String[] args) throws IOException {

		System.out.println("Main Starts Here");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Two Numbers: ");

		try {
			int a = Integer.parseInt(br.readLine()); // Unhandled exception type IOException
			int b = Integer.parseInt(br.readLine());
			int c = divideMet(a, b); // ArithmeticException divided by 0
			System.out.println("Answer : " + c);
		} catch (Exception e) {
			System.out.println("Exception are Handled....." + e);
		} finally {
			System.out.println("In Finally ......");
		}
		System.out.println("Rest of the Codes......");
		System.out.println("Main Ends Here");
	}

	public static int divideMet(int a, int b) throws MyOwnExce {
		int c = 0;
		if (b == 0) {
			throw new MyOwnExce("Problem Occured Due to Your Input......");
		} else {
			c = a / b;
		}
		return c;
	}
}
