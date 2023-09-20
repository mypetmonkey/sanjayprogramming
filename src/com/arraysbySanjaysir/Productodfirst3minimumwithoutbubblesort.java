package com.arraysbySanjaysir;

public class Productodfirst3minimumwithoutbubblesort {
	public static void main(String[] args) {
		int a[]= {5,3,1,2,4};
		int fmin=a[4];
		int smin=a[4];
		int tmin=a[4];
		for(int i=0;i<a.length;i++) {
			if(a[i]<fmin) {
				tmin=smin;
				smin=fmin;
				fmin=a[i];
			}
			else if(a[i]<tmin) {
				tmin=smin;
				smin=a[i];
			}
			else if(a[i]<tmin) {
				tmin=a[i];
			}
	}
      System.out.println(" 1st min num is :"+fmin);
      System.out.println("2nd min num is :"+smin);
      System.out.println("3rd min num is :"+tmin);
      System.out.println("product is::"+fmin*smin*tmin);
	}

}
