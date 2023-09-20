package com.arraysbySanjaysir;

public class AddTwoArray2 {
	static void addArray(int[] ar1,int []ar2) {
		int length=ar1.length;
		if(length<ar2.length)
			length=ar2.length;
		for(int i=0;i<length;i++) {
		try {
		  System.out.print(ar1[i]+ar2[2]+" ");
		}catch (Exception e) {
			if(length<ar1.length)
				System.out.print(ar1[i]+" ");
			else
				System.out.print(ar2[i]+" ");
		  }
		}
	}
	public static void main(String[] args) {
		int ar1[]= {2,3,4,5,6};
		int ar2[]= {4,5,3,6,4,3};
		addArray(ar1,ar2);
		
	}

}
