package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		boolean b=isStrong(n);
		if(b)
		System.out.println("yes");
		else
			System.out.println("no");
	}
	
	
      static boolean isStrong(int x) {
    	  int sum=0;
    	  int temp=x;
    	  do {
    		  int d=x%10;
    		  sum=sum+fact(d);
    		  x=x/10;
    		  
    	  }while(x!=0);
    	  return sum==temp;
      }
      
      
      static int fact(int n) {
    	  int mul=1;
    	  for(int i=n;i>1;i--) {
    		  mul=mul*i;
    	  }
    	  return mul;
      }
}
