package com.SanjaysirString;

public class MiniLengthWord {
	public static void main(String[] args) {
		String st[]= {"ab","abc","dv","abcdd","abcd","ab"};//op=ab
		String small=st[0];
		for(int i=0;i<st.length;i++) {
			if(small.length()>st[i].length())
				small=st[i];
		}
		for(int i=0;i<st.length;i++) {
			if(small.length()==st[i].length()) {
				System.out.println(st[i]+" ");
			}
		}
	}

}
