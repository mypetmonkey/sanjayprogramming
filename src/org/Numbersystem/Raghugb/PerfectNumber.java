package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		boolean res=isPerfect(n);
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
				
	}
	static boolean isPerfect(int x) {
		int sum=0,temp=x;
		for(int i=1;i<=x/2;i++) {
			if(x%i==0)
				sum=sum+i;
		}
		return sum==temp;
	}

}
