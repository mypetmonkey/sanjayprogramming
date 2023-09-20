package com.programming.sanjaysir;

import java.util.ArrayList;
 import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<>();
		al.add(10);
		al.add("raju");
		al.add(null);
		al.add("hi");
		al.add("hello");
		al.add("raju");
		al.add("hello");
		System.out.println(al);
		
		ArrayList<Integer> all=new ArrayList<>();
		all.add(10);
		all.add(20);
		all.add(60);
		all.add(0);
		all.add(5);
		Collections.sort(all);
		System.out.println(all);
		al.addAll(all);
		System.out.println(al);
		if(al.contains("hello")) 
			System.out.println("it is present");
		else
			System.out.println("not present");
		
		System.out.println(al.get(2));
		System.out.println(al.size());
		System.out.println(al.remove(3));
		System.out.println(al.indexOf("hello"));
		for(Object value:al) {
			System.out.println(value);
		}
		Iterator<Object> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("stack concept===============================");
		Stack<Object> st=new Stack<>();
				
	}
	

}
