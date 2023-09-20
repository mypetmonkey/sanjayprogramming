package com.Pattern.sanjaysir;

public class Mountain {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=i;j<=6;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
