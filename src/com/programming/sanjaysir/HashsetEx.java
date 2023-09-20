package com.programming.sanjaysir;

import java.util.ArrayList;
import java.util.HashSet;


public class HashsetEx {
	public static void main(String[] args) {
		HashSet<Object> hs=new HashSet<>();
		hs.add(10);
		hs.add("hii");
		hs.add("hello");
		hs.add(null);
		hs.add(10);
		hs.add(false);
		System.out.println(hs);
		ArrayList<Object> al = new ArrayList<>(hs); 
		al.add(20);
		al.add("raju");
		al.add(10);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(hs.size());
	}
	

}
