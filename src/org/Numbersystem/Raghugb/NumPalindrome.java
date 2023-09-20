package org.Numbersystem.Raghugb;

public class NumPalindrome {
    public static void main(String[] args) {
    	int n=12321;
        boolean b=isPali(n);
        if(b)
        	System.out.println("yes");
        else
        	System.out.println("no");
	}	
    static boolean isPali(int x) {
    	int rev=0,temp=x;
    	do {
    		int d=x%10;
    		rev=rev*10+d;
    		x=x/10;
    	}while(x!=0);
    	return rev==temp;
    		
    }
}
