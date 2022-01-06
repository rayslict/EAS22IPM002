package com.rays.set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> hashSet = new HashSet<>();  // Collection of Multiple elements(values or object) into single unit
		
		hashSet.add("Afee");
		hashSet.add("Rafi");
		hashSet.add("Ayaan");
		hashSet.add("Abidha");
		hashSet.add("Banu");
		
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		
		System.out.println("***** Using Iteration Method *******");
		Iterator<String> it =  hashSet.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			
			System.out.println(object);
			
		}
		System.out.println("***** Using Enhanced For Loop *******");
		
		for(Object obj : hashSet) {
			System.out.println(obj);
		}
		

	}

}
