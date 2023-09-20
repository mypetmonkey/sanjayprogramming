package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class MiddleValueAmong3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three numbers");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		if(p>q&&p<r||p<q&&p>r)
			System.out.println(p);
		else if(q>p&&q<r||q<p&&q>r)
			System.out.println(q);
		else
			System.out.println(r);
		sc.close();
	}

}
