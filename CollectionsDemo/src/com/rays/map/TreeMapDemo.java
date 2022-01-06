package com.rays.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TreeMap<Integer, String> trMap = new TreeMap<>();
		
		Map<Integer, String> trMap = new TreeMap<>();
		
		trMap.put(101, "India");
		trMap.put(102, "England");
		trMap.put(103, "SriLanka");
		trMap.put(104, "Australia");
		trMap.put(105, "South Africa");
		
		System.out.println(trMap.get(101));
		
		System.out.println(trMap);
		
		for(Map.Entry<Integer, String> e : trMap.entrySet()) {
			
			System.out.println(e.getKey()+"\t"+e.getValue());
		}

	}

}
