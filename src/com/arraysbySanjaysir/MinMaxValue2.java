  package com.arraysbySanjaysir;

public class MinMaxValue2 {
	public static void main(String[] args) {
		int a[]= {5,3,0,1,4,-1};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) 
				max=a[i];
			else if(min>a[i]) 
				min=a[i];
		}
		System.out.println("maximum value is:"+max);
		System.out.println("minum value is:"+min);
	}

}
