package com.SanjaysirString;

public class MakeIndexBased {
     public static void main(String[] args) {
		String st="i am Student";
		char ch[]=st.toCharArray();
		int wc=ch[0];
		for(int i=0;i<ch.length;i++) {
			if(i==0 && ch[i]!=' ' || ch[i]!=' '&&ch[i-1]==' ') {
				wc++;
				int a[]=new int[wc];
				for(int j=0;j<a.length;j++) {
					System.out.println(a[j]);
				}
			}
		}
		System.out.println(wc);
	}
}
