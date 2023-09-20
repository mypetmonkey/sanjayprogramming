 package com.SanjaysirString;

import java.util.Scanner;

public class MergeString {
	public static String getMerge(String st1,String st2) {
		char ch1[]=st1.toCharArray();
		char ch2[]=st2.toCharArray();
		char chh[]=new char[ch1.length+ch2.length];
		int p=0,q=0;
		while(ch1.length>p&&ch2.length>p) {
			  chh[q]=ch1[p];
			  q++;
			  chh[q]=ch2[p];
			  p++;
			  q++;
		}
			  while(ch1.length>p) {
				  chh[q]=ch1[p];
				  q++;
				  p++;
			  }
				  while(ch2.length>p) {
					  chh[q]=ch2[p];
					  q++;
					  p++;
		   }
				String  st=new String(chh);
				  return st;
	  }
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first val");
	String s1=sc.nextLine();
	System.out.println("enter 2nd val");
	String s2=sc.nextLine();
	String res=getMerge(s1,s2);
	System.out.println(res);
	sc.close();
}
}
