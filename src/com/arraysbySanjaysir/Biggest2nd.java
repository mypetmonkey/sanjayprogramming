package com.arraysbySanjaysir;

public class Biggest2nd {
	public static void main(String[] args) {
		int a[]= {5,3,0,1,4};
		int n=2;
		for(int i=0;i<a.length;i++) { //0<5 1<5(t)
			int count=0; //count=0
			for(int j=0;j<a.length;j++) { //0<5 1<5 2<5 3>5 4<5 5<5(f)
				if(a[j]>a[i]) //5>3(f) 3>3(f) 0>5(f) 1>5(f) 4>5(f)
					count++; //count=1
			}
			if(count==n-1) //0==2-1=>0==1(f)
				System.out.println("2nd biggestest is "+a[i]);
		}
	}

}
