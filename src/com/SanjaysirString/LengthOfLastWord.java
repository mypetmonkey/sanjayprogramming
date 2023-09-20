package com.SanjaysirString;

import java.util.Scanner;

public class LengthOfLastWord {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		String str[]=st.split(" ");
		for(int i=str.length-1;i>str.length-2;i--) {
			System.out.println("length of last word : "+str[i].length());
		}
	}

}
