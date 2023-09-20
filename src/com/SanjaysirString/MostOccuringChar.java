package com.SanjaysirString;

public class MostOccuringChar {
	public static void main(String[] args) {
		String st="rajhans Mehta";
		int max=0;
		int count[]=new int[128];
		for(int i=0;i<st.length();i++) {
			char c=st.charAt(i);
			count[c]++;
		}
		for(int i=0;i<128;i++) {
			if(count[i]>max&&count[i]>1)
				max=count[i];
			System.out.println((char)i+" == "+max);
		}
		
//wrong program
	}

}
