package com.SanjaysirString;

public class ReverseString {
	public static void main(String[] args) {
		String st="i am a software engineer";
		String rs=getReverse(st);
		System.out.println(rs);
	}
	static String getReverse(String s) {
			char ch[]=s.toCharArray();
			int i=0,j=ch.length-1;
			while(i<j) {
				char temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				i++;
				j--;
			}
			s=new String(ch);
			return s;
	}
}
