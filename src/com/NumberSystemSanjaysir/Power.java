package com.NumberSystemSanjaysir;

public class Power {
	public static void main(String[] args) {
	int n=5;
	int p=3;
	int rs=pow(n,p);
	System.out.println(rs);
	}
	static int pow(int n,int p) {
		int mul=1;
		while(p>0) {
			mul=mul*n;
			p--;
		}
		return mul;
	}
}
