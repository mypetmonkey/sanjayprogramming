  package com.SanjaysirString;

public class MaxLengthWord {
	public static void main(String[] args) {
		String st[] = {"123","12","12343","144","123"};//op=ab
		String large=st[0];
		for(int i=0;i<st.length;i++) {
			if(large.length()<st[i].length())
				large=st[i];
		}
		for(int i=0;i<st.length;i++) {
			if(large.length()==st[i].length()) {
				System.out.println(st[i]+" ");
			}
		}
	}
}
