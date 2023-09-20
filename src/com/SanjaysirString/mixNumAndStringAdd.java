package com.SanjaysirString;

public class mixNumAndStringAdd {
	public static void main(String[] args) {
		String st="a3u4id7";
		int sum=0;
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='0'&&ch<='9')
				sum=(sum+ch)-48;
		}
		System.out.println(sum);
	}

}
