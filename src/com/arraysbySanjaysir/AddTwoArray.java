 package com.arraysbySanjaysir;

public class AddTwoArray {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,7};
		int b[]= {5,4,3,2,7,7};
		
        int length=a.length;
        if(length<b.length) 
        	length=b.length;
        
        for(int i=0;i<length;i++) {
        	try {
        		System.out.print(a[i]+b[i]+",");
        	}catch(Exception e) {
        		if(length<a.length) {
        			System.out.print(b[i]+" ");
        		} 
        		else
        			System.out.print(a[i]+" ");
        	}
        	
        }
	}

}
