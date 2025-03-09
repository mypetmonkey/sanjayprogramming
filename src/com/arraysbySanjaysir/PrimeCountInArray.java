package com.arraysbySanjaysir;

public class PrimeCountInArray {

	
	static int countPrime(int[] n){
        int count=0;
        for(int i=0;i<n.length;i++){
            int y=n[i];
            boolean b=isPrime(y);
            if(b==true)
            count++;
        }
        return count;
    }
    static boolean isPrime(int x){
        for(int i=2;i<=x/2;i++){
            if(x%i==0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,7,8};
        int count=countPrime(ar);
        System.out.println(count);
    }
}
