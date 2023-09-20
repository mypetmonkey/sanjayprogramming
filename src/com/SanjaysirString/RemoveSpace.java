package com.SanjaysirString;

public class RemoveSpace {
	public static void main(String[] args) {
		String st="i am a software engineer";
//		String s[]=st.split(" ");
//		for(int i=0;i<s.length-1;i++) {
//			System.out.print(s[i]);
//		}
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch==' ') {
				
			}
			else {
				System.out.print(ch);
			}
		}
		
	}

}
