package com.SanjaysirString;

public class WitrhoutLength {
	public static int Len(String str) {
	    if (str.equals("")) {
	        return 0;
	    } else {
	        char ch []= str.toCharArray();
 	        String length= new String(ch, 1, ch.length-1);
	        return 1 + Len(length);
	    }
	}
	public static void main(String[] args) {
		String st="Rajhans";
		int res=Len(st);
		System.out.println(res);
	}

}
