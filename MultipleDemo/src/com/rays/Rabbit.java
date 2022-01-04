package com.rays;

public class Rabbit implements Animal, Pet {

	@Override
	public void color() {

		System.out.println("White");
		
	}

	@Override
	public void food() {

		System.out.println("Leaf");
		
	}
	
	public void sound() {
		System.out.println("PePePePePe");
	}

}
