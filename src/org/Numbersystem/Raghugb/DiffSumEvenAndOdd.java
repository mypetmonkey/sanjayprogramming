package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class DiffSumEvenAndOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		int res=diff(n);
		System.out.println(res);
	}
   static int diff(int x) {
	   int evsum=0;
	   int odsum=0;
	   do {
		   int d=x%10;
		   if(d%2==0)
			   evsum=evsum+d;
		   else
			   odsum=odsum+d;
		   x=x/10;
	   }while(x!=0);
	   return odsum-evsum;
   }
}
