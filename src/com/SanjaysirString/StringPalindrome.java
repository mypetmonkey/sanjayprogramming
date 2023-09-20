package com.SanjaysirString;

public class StringPalindrome {
	public static void main(String[] args) {
		String st="malayalam";
		boolean b=isPalindrome(st);
		if(b)
			System.out.println(st+"  is palindrome");
		else
			System.out.println(" not palindrome");
	}
     static boolean isPalindrome(String s) {
    	 char ch[]=s.toCharArray();
    	 int i=0,j=ch.length-1;
    	 while(i<j) {
    		 if(ch[i]!=ch[j])
    			 return false;
    		 i++;
    		 j--;
    	 }
    	 return true;
     }
}
