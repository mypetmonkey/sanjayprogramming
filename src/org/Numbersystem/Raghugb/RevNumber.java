package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class RevNumber {
	
	static int getReverse(int x) {
		int rev=0;
		do {
			int d=x%10;
			rev=rev*10+d;
			x=x/10;
		}while(x!=0);
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int res=getReverse(n);
		System.out.println(res);
	}

}
