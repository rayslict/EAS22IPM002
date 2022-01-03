package com.cognizant;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildDemo demo = new ChildDemo();
		demo.home=120000;
		demo.land=234567;
		demo.jewel=56789;
		demo.parentMet();
		demo.accessParent();
		
		
		ParentDemo pd = new ChildDemo();
		
		

	}

}
