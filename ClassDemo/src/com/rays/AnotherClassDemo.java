package com.rays;

public class AnotherClassDemo {
	
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
