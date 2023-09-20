package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		int cnt=cntDigit(n);
		System.out.println(cnt);
	}
   static int cntDigit(int x) {
	   int count=0;
	   do {
		   x=x/10;
		   count++;
	   }while(x!=0);
	   return count;
   }
}
