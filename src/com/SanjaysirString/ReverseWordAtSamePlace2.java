package com.SanjaysirString;

public class ReverseWordAtSamePlace2 {
	
public static void main(String[] args) {
	String st="my name is Raj";
	String str[]=st.split(" ");
	for(int i=0;i<str.length;i++) {
		char ch[]=str[i].toCharArray();
		int p=0,q=ch.length-1;
		while(q>p) {
			char temp=ch[p];
			ch[p]=ch[q];
			ch[q]=temp;
			p++;
			q--;
		}
		str[i]=new String(ch);
		
	}
	System.out.println(String.join(" ", str));
}
      
}