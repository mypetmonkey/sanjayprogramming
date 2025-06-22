package com.arraysbySanjaysir;

public class MissedNumInArray {
	public static void main(String[] args) {
		
		int a[]= {1,2,3,5,6,7};
		int n=a.length;
		int sum=(n*(n+1))/2;
		int asum=0;
		for(int num:a) {
			asum=asum+num;
		}
	int	mn=sum-asum;
		System.out.println(mn);
			  }	
			}
		
	


