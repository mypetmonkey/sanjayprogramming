 package com.NumberSystemSanjaysir;

public class Fibonacci {
	public static void main(String[] args) {
		int fn=0;
		int sn=1;
		int tn=0;
		System.out.print(fn+" "+sn);
		while(true) {
			tn=fn+sn;
			if(tn>35)
				break;
			System.out.print(" "+tn);
			fn=sn;
			sn=tn;
		}
	}

}
