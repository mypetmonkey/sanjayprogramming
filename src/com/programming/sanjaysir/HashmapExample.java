package com.programming.sanjaysir;

import java.util.HashMap;

public class HashmapExample {
	public static void main(String[] args) {
		
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Raj", 25);
		map.put("hans", 26);
		map.put("mehta", 27);
		
		Integer rajage = map.get("Raj");
		Integer hansage = map.get("hans");
		Integer mehtaage = map.get("mehta");
		System.out.println("raj age is:"+rajage);
		System.out.println("hans age is:"+hansage);
		System.out.println("mehta age is:"+mehtaage);

	}

}
