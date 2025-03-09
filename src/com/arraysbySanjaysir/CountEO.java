package com.arraysbySanjaysir;

public class CountEO {
	
	static int[] counteo(int []a){
        int ec=0;
        int oc=0;
        for(int i=0;i<a.length;i++){
            if(i%2==0)
            ec++;
            else
            oc++;
        }
        int count[]={ec,oc};
        return count;
    }
    public static void main(String[] args) {
        int ar[]={4,3,5,1,2,6,8,9,4};
        int res[]=counteo(ar);
        System.out.println("even num count "+res[0]);
        System.out.println("odd num count "+res[1]);
        
    }

}
