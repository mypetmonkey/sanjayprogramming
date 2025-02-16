package com.SanjaysirString;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {
	public static void main(String[] args) {
		String st="i am i am software engineer";
		String[] s=st.split(" ");
		int count=0;

		LinkedHashSet<String> set=new LinkedHashSet<>();
		for(int i=0;i<s.length;i++) {
			set.add(s[i]);
		}
		for(String str:set) {
			for(int i=s.length-1;i>=0;i--) {
				if(str.equals(s[i])) {
					count++;
				}
			}
			System.out.println(str+" is repeating "+count);
		}
	}
}
