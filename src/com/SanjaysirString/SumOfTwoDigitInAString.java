     package com.SanjaysirString;

public class SumOfTwoDigitInAString {
	public static void main(String[] args) {
		String s="a11b12c2";//25 
		 int sum=0;
		 int tsum=0;
		 for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 if(ch>='0'&& ch<='9') {
				//  int n=ch-48;//49-48=1
				 tsum=tsum*10+(ch-48);
			 }
			 else {
				 sum=sum+tsum;//11+12=23
				 tsum=0;//0
			 }
		 }
		sum=sum+tsum;//23+2=25
		System.out.println(sum);
		
	}

}
