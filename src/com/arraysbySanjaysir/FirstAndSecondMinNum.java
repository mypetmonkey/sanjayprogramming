package com.arraysbySanjaysir;

public class FirstAndSecondMinNum {
	public static void main(String[] args) {
	int a[]= {0,5,4,1,0,3,-1};
	int fmin=a[0];
	int smin=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<fmin) {
			if(a[i]!=fmin) {
				smin=fmin;
			}
			fmin=a[i];
		}
		else if(fmin==smin || smin>a[i]) {
			smin=a[i];
		}
	}
	System.out.println("first min:"+fmin);
	System.out.println("2nd min:"+smin);
	}
}
