package com.rays;

public class MainDemo {

	public static void main(String[] args) {
		
		Rabbit rabbit = new Rabbit();
		rabbit.color();
		rabbit.food();
		rabbit.sound();
		
		
		Animal animal = new Rabbit();  // Implicit Casting
		animal.food();
		
		Rabbit ra = (Rabbit) animal;   // Explicit Casting
		
		Pet pet = new Rabbit();
		pet.color();

	}

}
