package com.SanjaysirString;

import java.util.LinkedHashSet;

public class CountOfUniqueWords {
    public static void main(String[] args) {
    	int a[] = {4,5,4,1,5,3,2};
    	
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<a.length;i++) {
			boolean rs = set.add(a[i]);
			if(rs)
				System.out.println(a[i]);
		}
	}
}
