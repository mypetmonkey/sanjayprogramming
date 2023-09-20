package com.SanjaysirString;

import java.util.TreeSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int ar[]= {4,5,4,1,5,3,2};
		TreeSet<Integer> l=new TreeSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			l.add(ar[i]);
		}
		for(  Integer p:l) {
			System.out.print(p+",");
		}
	}
}
