package com.arraysbySanjaysir;

public class FirstAndSecondMax {
	public static void main(String[] args) {
		int a[]= {5,3,0,2,4};
		int fmax=a[4];
		int smax=a[4 ];
		for(int i=0;i<a.length;i++) {
			if(a[i]>fmax) {
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax) {
				smax=a[i];
			}
		}
		System.out.println("first max num is:"+fmax);
		System.out.println("second max num is:"+smax);
	}

}
