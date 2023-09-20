  package com.SanjaysirString;

public class Set_String_As_Expected {
	public static void main(String[] args) {
		String s="i am raju";//u ja 
		String rev="";
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)!=' ') 
				rev=s.charAt(i)+rev;
			}
		
		//System.out.println(rev+" ");
		for (int i=0;i<s.length();i++) {
			if (s.charAt(i)==' ') 
				rev=rev.substring(0,i)+" "+rev.substring(i);
			}
		
		System.out.println(rev);
	    }
}


 