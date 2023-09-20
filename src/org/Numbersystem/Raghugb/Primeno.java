package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class Primeno {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  any number");
		int n=sc.nextInt();
		boolean res=isPrime(n);
		if(res)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
				
	}
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
}
