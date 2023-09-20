package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class DiffBigAndSmallDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		int res=diff(n);
		System.out.println(res);
	}
   static int diff(int x) {
	   int big=-9;
	   int small=9;
	   do{
		   int d=x%10;
		   if(d>big)
			   big=d;
		   if(d<small)
			   small=d;
		   x=x/10;
	   }while(x!=0);
	   return big-small;
   }
}
