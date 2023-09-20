package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		int res=sumDigit(n);
		System.out.println(res);
	}
   static int sumDigit(int x) {
	   int sum=0;
	   do {
		 int d=x%10;
		 sum=sum+d;
		   x=x/10;
	   }while(x!=0);
	   return sum;
   }

}
