package com.cognizant;

public class ChildDemo extends ParentDemo{   // Sub Class or Derived Class or Child Class

	public void accessParent() {
		
		System.out.println("From Child Class Method ...");
		System.out.println("Home : "+home);
		System.out.println("Land : "+land);
		System.out.println("Jewel : "+jewel);
		System.out.println("Car : "+car);
	}
}
