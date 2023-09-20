package com.arraysbySanjaysir;

public class Secondmin {
	public static void main(String[] args) {
		int a[]= {5,3,0,7,1,4};
		int n=2;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i])
					count++;
			}
			if(count==n-1)
				System.out.println("2nd smallestest is "+a[i]);
		}
	}

}
