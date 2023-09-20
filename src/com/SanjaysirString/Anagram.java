 package com.SanjaysirString;

import java.util.Arrays;

public class Anagram {
		  static boolean isAnagram(String s1, String s2) {  
		        String st1 = s1.replaceAll(" ", "");  
		        String st2 = s2.replaceAll(" ", "");  
		        if (st1.length() != st2.length()) 
		            return false;  
		        else {  
		            char[] ch1= st1.toLowerCase().toCharArray();  
		            char[] ch2= st2.toLowerCase().toCharArray();  
		            Arrays.sort(ch1);  
		            Arrays.sort(ch2);  
		           return Arrays.equals(ch1, ch2);
		        }  
		    }  
		    public static void main(String[] args) {  
		    	String str1="mother in law";
		    	String str2="hitlar women";
		    	boolean b=isAnagram(str1,str2);
		    	 if(b)
		    		 System.out.println("yes");
		    	 else
		    		 System.out.println("no");
		    }  
	}


