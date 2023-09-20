package com.SanjaysirString;

public class OnlyDuplicateCharCount {
public static void main(String[] args) {
	String st="kannada";
	int count[]=new int[128];
	for(int i=0;i<st.length();i++) {
		char ch=st.charAt(i);
		count[ch]++;
	}
	for(int i=0;i<128;i++) {
		if( count[i]>1)
			System.out.println((char)i+" is repeating "+count[i]+" times");
	}
}
}
