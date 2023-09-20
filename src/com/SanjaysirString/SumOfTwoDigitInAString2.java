package com.SanjaysirString;

public class SumOfTwoDigitInAString2 {
	public static int sum(String s) {
		int sum=0;
		int tsum=0;
		for(int i=0;i<s.length();i++) {
			 if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
				int n = s.charAt(i)-48;
				tsum=tsum*10+n;
			}else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		return sum;
	}
	public static void main(String[] args) {
		String st="a12jdh12kk2r";
		int res=sum(st);
		System.out.println(res);
	}

}
