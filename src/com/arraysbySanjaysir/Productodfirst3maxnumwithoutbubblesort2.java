 package com.arraysbySanjaysir;

public class Productodfirst3maxnumwithoutbubblesort2 {
	public static void main(String[] args) {
		int a[]= {5,2,3,0,2,4};
		int p=1,q=2,r=3;
		int f=a[0],s=a[0],t=a[0];
		for(int i=0;i<a.length;i++) {
 			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]>a[i])
					count++;
			  }
			if(count==p-1) 
				f=a[i];
			if(count==q-1) 
				 s=a[i];
			if(count==r-1) 
			     t=a[i];
	        }
		System.out.println(f);
		System.out.println("product of 3 max value is :"+f*s*t);
      } 
} 