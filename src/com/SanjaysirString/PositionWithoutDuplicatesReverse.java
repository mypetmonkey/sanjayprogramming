package com.SanjaysirString;

import java.util.LinkedHashSet;

public class PositionWithoutDuplicatesReverse {
	public static void main(String[] args) {
		int a[]= {4,5,4,1,5,3,2};
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			set.add( a[i]);
		}
		for( Integer num:set) {
			for(int i=a.length-1;i>=0;i--) {
				if(num==a[i]) {
					System.out.println(num+" present at "+(i+1)+" position");
					break;
				}
			} 
		}
		 
	}

}
