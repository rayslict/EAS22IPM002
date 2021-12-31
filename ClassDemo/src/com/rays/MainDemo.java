package com.rays;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Main Started Here");
		AnotherClassDemo demo = new AnotherClassDemo();
		demo.withOutBoth();
		demo.withArgu(scanner.next());
		int ar = demo.withReturn();
		System.out.println("Area from withReturn Method : "+ar);
		double d = demo.withBoth(5, 2);
		System.out.println("Divided Value from withBoth Method : "+d);
		demo.staMet();
		AnotherClassDemo.staMet();		
		System.out.println("Main Ends Here");
	}
	
	
}
