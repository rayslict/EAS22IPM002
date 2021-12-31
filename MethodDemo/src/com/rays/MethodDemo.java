package com.rays;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Main Started Here");
		MethodDemo demo = new MethodDemo();
		demo.withOutBoth();
		demo.withArgu(scanner.next());
		int ar = demo.withReturn();
		System.out.println("Area from withReturn Method : "+ar);
		double d = demo.withBoth(5, 2);
		System.out.println("Divided Value from withBoth Method : "+d);
		demo.staMet();
		MethodDemo.staMet();
		staMet();   // Within the class
		System.out.println("Main Ends Here");
	}
	
	static void staMet() {
		System.out.println("From Static Method");
	}
	
	void withOutBoth() {
		System.out.println("Without Return Type and Without Arguments");
	}
	
	void withArgu(String name) {
		System.out.println("Without Return Type and With Arguments : "+name);
	}
	
	int withReturn() {
		int area = 12 * 3;
		System.out.println("With Return Type and Without Arguments");
		return area;
	}
	double withBoth(int a, int b) {
		double c =(double) a/b;
		System.out.println("With Return Type and With Arguments");
		return c;
	}
}
