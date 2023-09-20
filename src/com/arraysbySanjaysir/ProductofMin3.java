package com.arraysbySanjaysir;

public class ProductofMin3 {
public static void main(String[] args) {
	int a[]= {5,3,0,1,4};
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[j]<a[i]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
		int prod=1;
		for(int k=0;k<3;k++) {
			prod=prod+a[k];
		}
		System.out.println(prod);
}
}
