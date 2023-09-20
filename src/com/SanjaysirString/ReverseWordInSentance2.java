package com.SanjaysirString;

public class ReverseWordInSentance2 {
	public static void main(String[] args) {
		String s="hello world";
		String st[]=s.split(" ");
		String str="";
		for(int i=0;i<st.length;i++) {
			for(int j=0;j<st[i].length();j++) {
				char ch=st[i].charAt(j);
				str=ch+str;
			}
			str=str+" ";
		}
		System.out.println(str+" ");
	}

}
