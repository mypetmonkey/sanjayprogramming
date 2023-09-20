package com.arraysbySanjaysir;

public class secondbigandsmall {
	public static void main(String[] args) {
		 int ar[]={2,3,4,5,6,7,1,8,9};
         int n=2;
         int small=ar[0];
         int large=ar[0];
         for(int i=0;i<ar.length;i++) {
        	 int countl=0;
        	 int counts=0;
        	 for(int j=0;j<ar.length;j++) {
        		 if(ar[i]<ar[j])
        			 countl++;
        		 if(ar[i]>ar[j])
        			 counts++;
        	 }
        	 if(countl==n-1)
        		 large=ar[i];
        	 if(counts==n-1)
        		 small=ar[i];
        	
         }
         System.out.println("2nd largest "+large);
    	 System.out.println("2nd smallest "+small);
       
	}

}
