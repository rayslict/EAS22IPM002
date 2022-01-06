package com.rays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.rays.pojo.Associates;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		List<Associates> aList = new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("Id:");
			int id = scanner.nextInt();
			System.out.println("Name : ");
			String name = scanner.next();
			System.out.println("Age : ");
			int age = scanner.nextInt();
			System.out.println("City : ");
			String city = scanner.next();
			Associates associates = new Associates(id, name, age, city);
			aList.add(associates);
		}
		
		for(Associates a : aList) {
			System.out.println(a);
		}

	}

}
