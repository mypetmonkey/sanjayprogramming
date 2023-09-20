package org.Numbersystem.Raghugb;


public class Primenumber1To100 {
	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
		boolean res=isPrime(i);
		  if(res)
			System.out.println(i);  
		}	
	}
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i==0)
				return false;
		}
		return true;
	}
}
