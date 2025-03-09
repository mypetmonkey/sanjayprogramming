package com.arraysbySanjaysir;

public class IsElementPresent {
	
	 public static void main(String[] args) {
	        int ar[]={2,5,7,9,1,0};
	        
	        int n=99;
	        boolean b=false;
	        for(int i=0;i<ar.length;i++){
	            if(ar[i]==n){
	            b=true;
	            break;
	            }
	        }
	        if(b==true)
	        System.out.println("yes");
	        else
	              System.out.println("No");
	    }

}
