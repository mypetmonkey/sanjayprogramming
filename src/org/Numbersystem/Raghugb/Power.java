package org.Numbersystem.Raghugb;

public class Power {
	public static void main(String[] args) {
		int n=5;
		int p=3;
		int res=pow(n,p);
		System.out.println(res);
	}
     static int pow(int n,int p) {
    	 int mul=1;
    	 while(p>0) {
    		 mul=mul*n;
    		 p--;
    	 }
    	 return mul;
     }
}
