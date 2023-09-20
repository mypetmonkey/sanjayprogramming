package com.SanjaysirString;

public class SumOfNumInString {
	public static void main(String[] args) {
		String st="a11b12c2";
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0' && ch<='9') {
				//int n=ch-48;
				sum=sum+ch-48;
			}
		}
		System.out.println(sum);
	}

}
