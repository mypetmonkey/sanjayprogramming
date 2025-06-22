 package com.arraysbySanjaysir;

public class AddTwoArray {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,7};
		int b[]= {5,4,3,2,7,7};
		
        int length1=a.length;
        int length2=b.length;
        
        int length=length1;
        if(length<length2) 
        	length=length2;
        else 
        	length=length1;
        
        for(int i=0;i<length1;i++) {
        	try {
        		System.out.print(a[i]+b[i]+",");
        	}catch(Exception e) {
        		if(length1<a.length) {
        			System.out.print(b[i]+" ");
        		} 
        		else
        			System.out.print(a[i]+" ");
        	}
        	
        }
	}

}
