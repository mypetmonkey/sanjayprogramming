package com.SanjaysirString;

import java.util.LinkedHashSet;

public class CountNoOfvowelsWithoutDuplicates {
	public static void main(String[] args) {
		String s="Engineer";
		String st=s.toLowerCase();
		char ch[]=st.toCharArray();
		int count=0;
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(Character chr:set) {
			if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u') {
				count++;
				System.out.print(chr);
			
			}
			
		}
		System.out.print(" ==> "+count);
	}

}
