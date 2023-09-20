 package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class Diserium {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		boolean b=isDiserium(n);
		if(b)
			System.out.println("yes");
		else
			System.out.println("no");
	}
    static boolean isDiserium(int x) {
	int sum=0;
	int temp=x;
	int cd=countDigit(x);
	do {
		int d=x%10;
		sum=sum+pow(d,cd);
		cd--;
		x=x/10;
	}while(x!=0);
	return temp==sum;
   }
    static int countDigit(int d) {
    	int count =0;
    	do {
    		d=d/10;
    		count++;
    	}while(d!=0);
    	return count;
    }
    static int pow(int n,int p ) {
    	int mul=1;
    	while(p>0) {
    		mul=mul*n;
    		p--;
    	}
    	return mul;
    }
	

}
