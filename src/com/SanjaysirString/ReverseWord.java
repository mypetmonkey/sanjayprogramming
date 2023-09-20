package com.SanjaysirString;

public class ReverseWord {
	public static void main(String[] args) {
		String str="my name is Raju";
		String st[]=str.split(" ");
		String rev="";
		for(int i=0;i<st.length;i++) {
			if(st[i].equalsIgnoreCase("raju")) {
				rev=rev+getReverse(st[i]);
				System.out.print(rev+" ");
		}else {
			System.out.print(st[i]+" ");
		  }
		}
	}
   static String getReverse(String st) {
	   char[] ch=st.toCharArray();
	   int i=0;
	   int j=ch.length-1;
	   while(i<j) {
		   char temp=ch[i];
		   ch[i]=ch[j];
		   ch[j]=temp;
		   i++;
		   j--;
	   }
	   st=new String(ch);
	   return st;
   }
}
