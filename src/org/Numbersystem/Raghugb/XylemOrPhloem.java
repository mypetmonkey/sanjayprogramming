package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class XylemOrPhloem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		String st=checkxp(n);
		System.out.println("given numis : "+st);
		sc.close();
	}
	
	
	 
   static String checkxp(int x) {
	   int esum=0,msum=0,temp=x;
	   do {
		   int d=x%10;
		   if(x==temp||x<10)
			   esum=esum+d;
		   else
			   msum=msum+d;
		   x=x/10;
	   }while(x!=0);
	   if(esum==msum)
	   return "xylem";
	   else
	   return "phloem";
   }
}
