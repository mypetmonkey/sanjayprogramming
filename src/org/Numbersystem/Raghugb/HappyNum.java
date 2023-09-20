package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class HappyNum {
	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		System.out.println("enter any num");
		int n=sc.nextInt();
		boolean b=isHappy(n);
		if(b)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}
	 static boolean isHappy(int x) {
		 while(x>9) {
			 int sum=0;
			 do {
				 int d=x%10;
				 sum=sum+d+d;
				 x=x/10;
			 }while(x!=0);
			 x=sum;
		 }
		 return x==1||x==7;
	 }

}
