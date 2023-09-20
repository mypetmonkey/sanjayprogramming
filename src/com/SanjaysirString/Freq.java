package com.SanjaysirString;

public class Freq {
	public static void main(String[] args) {
		String str = "aaabbcdddf"; // a3b2c1d3f1
		int count[]=new int[128];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<128;i++) {
			if(count[i]!=0)
				System.out.print((char)i+":"+count[i]+" ");
		}
	}

}
