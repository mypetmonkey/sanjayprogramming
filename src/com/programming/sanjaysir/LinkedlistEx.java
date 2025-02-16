package com.programming.sanjaysir;

import java.util.*;

public class LinkedlistEx {
	public static void main(String[] args) {
		LinkedList<Object>al=new LinkedList<>();
		al.add(10);
		al.add("raju");
		al.add(null);
		al.add("hi");
		al.add("hello");
		al.add("raju");
		al.add("hello");
		System.out.println(al);
		al.addFirst(20);
		al.addLast(50);
		System.out.println(al.getFirst());
		System.out.println(al);
		
}
}