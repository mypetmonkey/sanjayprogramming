package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class AvgOfDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		double res=avgDigit(n);
		System.out.println(res);
	}
   static double avgDigit(int x) {
	   int count=0;
	   double sum=0;
	   do {
		 int d=x%10;
		 sum=sum+d;
		   x=x/10;
		   count++;
	   }while(x!=0);
	   return sum/count;
   }
	

}
