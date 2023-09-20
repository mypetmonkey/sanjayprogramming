package com.programming.sanjaysir;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedhashsetEx {
	public static void main(String[] args) {
		LinkedHashSet<Object> al=new LinkedHashSet <>();
		al.add(10);
		al.add("raju");
		al.add(null);
		al.add("hi");
		al.add("hello");
		al.add("raju");
		al.add("hello");
		System.out.println(al);
}
}