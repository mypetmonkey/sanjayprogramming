package com.programming.sanjaysir;

import java.util.TreeSet;

public class TreeSetExToRemovedup {
	public static void main(String[] args) {
		int ar[]= {8,9,3,6,4,2,5,7,5,3,4,8,2,5,1};
		
		TreeSet<Integer> l=new TreeSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			l.add(ar[i]);
		}
		for(  Integer p:l) {
			System.out.print(p+",");
		}
	}

}
