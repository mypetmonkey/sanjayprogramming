package org.Numbersystem.Raghugb;

import java.util.Scanner;

public class ValidDate {
	public static void main(String[] args) {
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any date");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		if(d<1||d>31||m<1||m>12||y<1)
			System.out.println("invalid date");
		else
			System.out.println("valid date");
	}
	}
}
