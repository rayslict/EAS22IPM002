package com.rays.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> arrayList = new ArrayList<>();  // Collection of Multiple elements(values or object) into single unit
		
		arrayList.add("1001");
		arrayList.add("raffic");
		arrayList.add("3.14");
		arrayList.add("true");
		arrayList.add("raffic");
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		
		
		System.out.println("***** Using Iteration Method *******");
		Iterator<String> it =  arrayList.iterator();
		
		while (it.hasNext()) {
			Object object = (Object) it.next();
			
			System.out.println(object);
			
		}
		System.out.println("***** Using Enhanced For Loop *******");
		
		for(Object obj : arrayList) {
			System.out.println(obj);
		}
		

	}

}
