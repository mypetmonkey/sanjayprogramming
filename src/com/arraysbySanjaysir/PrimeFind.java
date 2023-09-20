package com.arraysbySanjaysir;

class PrimeFind {
	public static void main(String[] args) {
		int []a= {2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++) {
		int rs=getPrime(a);
		System.out.println(rs);
		}
	}
	static int  getPrime(int []x) {
		int count=0;
		for(int i=1;i<x.length;i++) {
			int y=x[i];
			boolean b=isPrime(y);
			if(b)
				count=x[i];
		}
		return count;
	}
	static boolean isPrime(int y) {
		for(int i=2;i<y/2;i++) {
			if(y%i==0)
				return false;
		}
		
			return true;
	}
	}


