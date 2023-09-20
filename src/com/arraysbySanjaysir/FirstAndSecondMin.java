package com.arraysbySanjaysir;

public class FirstAndSecondMin {
	public static void main(String[] args) {
		int a[]= {5,2,0,3,4};
		int fmin= a[0];
		int smin=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<smin) {
				smin=a[i];
			}
		}
		System.out.println("1st minimum value is:"+fmin);
		System.out.println("2nd minum value is:"+smin);
	}

}
