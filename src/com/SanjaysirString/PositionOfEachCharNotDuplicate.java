package com.SanjaysirString;

import java.util.*;

public class PositionOfEachCharNotDuplicate {
   public static void main(String[] args) {
	String st="kannada";
	String s=st.toLowerCase();
	LinkedHashSet<Character> set=new LinkedHashSet<>();
	for(int i=0;i<s.length();i++) {
		set.add(s.charAt(i));
	}
	for(Character ch:set) {
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				System.out.println(ch+" present at "+(i+1)+" position");
				break;
			}
		}
	}
  }
}
