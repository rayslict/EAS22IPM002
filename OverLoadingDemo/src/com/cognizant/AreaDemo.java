package com.cognizant;

public class AreaDemo {
	
	public void areaMet(int a) {
		int area = a * a;
		System.out.println("Area of Square : "+area);
	}

	public void areaMet(int a,int b) {
		int area = a * b;
		System.out.println("Area of rectangle : "+area);
	}
	
	public void areaMet(double a) {
		double area = 3.14 * a * a;
		System.out.println("Area of Circle : "+area);
	}
}
