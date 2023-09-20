package com.arraysbySanjaysir;

public class MinMaxValue {
	public static void main(String[] args) {
		int a[]= {5,3,0,1,4};
		int big=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
		}
	}
		System.out.println("biggest value is "+big);
		
		int small=a[0];
		for(int j=0;j<a.length;j++) {
			if(a[j]<small) {
				small=a[j];
		}
	}
		System.out.println("smallest value is:"+small);
		}
}

