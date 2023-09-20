package com.arraysbySanjaysir;

public class Productodfirst3maxnumwithoutbubblesort {
	public static void main(String[] args) {
		int a[]= {5,3,0,2,4};
		int fmax=a[4];
		int smax=a[4];
		int tmax=a[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				tmax=smax;
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>tmax) {
				tmax=smax;
				smax=a[i];
			}
			else if(a[i]>tmax) {
				tmax=a[i];
			}
	}
	//int product=fmax*smax*tmax;
      System.out.println("product of 3 max num is :"+tmax);
	}
}
