package com.SanjaysirString;

import java.util.TreeSet;

public class Countduplicates {
	public static void main(String[] args) {
		int a[]= {4,5,4,1,5,3,2,2 };
		TreeSet<Integer> ts=new TreeSet<Integer>();
		int count=0;
		for(int i=0;i<a.length;i++) {
			boolean p = ts.add(a[i]);
			if(p==false)
				count++;
		}
		System.out.println("duplicates no are "+count);
	}

}
