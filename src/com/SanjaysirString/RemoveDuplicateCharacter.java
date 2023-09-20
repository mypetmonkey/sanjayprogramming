 package com.SanjaysirString;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacter {
	public static void main(String[] args) {
		String st="Kannada";
		String s=st.toLowerCase();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		for(Character ch:set) {
			System.out.print(ch+" ");
		}
	}

}
