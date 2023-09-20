package com.SanjaysirString;

public class CountCapitalChar {
	public static void main(String[] args) {
		String st="RajHaNsMehTa";
		int upc=0;
		int lcc=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&& ch<='Z')
				upc++;
			else
				lcc++;
		}
		System.out.println("capitalcase letter are "+upc);
		System.out.println("lowercase letter are "+lcc);
	}

}
