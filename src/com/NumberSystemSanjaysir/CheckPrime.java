package com.NumberSystemSanjaysir;

public class CheckPrime {
public static void main(String[] args) {
	int n=4;
	boolean b=isPrime(n);
	if(b)
		System.out.println("yes");
	else 
		System.out.println("no");
}
static boolean isPrime(int x) {
	for(int i=1;i<x/2;i++) {
		if(x%2==0)
			return false;
	}
	return true;
}
}
