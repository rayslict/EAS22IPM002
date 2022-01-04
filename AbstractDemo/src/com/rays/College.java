package com.rays;

public class College extends University{

	public void courses() {
		System.out.println("CSE");
		System.out.println("AE");
	}

	@Override
	public void basicFees() {
		System.out.println("Basic Fees :"+50000);
		
	}
	
}
