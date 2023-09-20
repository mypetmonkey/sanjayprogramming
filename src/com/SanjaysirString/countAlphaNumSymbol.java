package com.SanjaysirString;

public class countAlphaNumSymbol {
	public static void main(String[] args) {
		String s="engineer  345$%&";
		//String s=st.toLowerCase();
		int digit=0,space=0,alp=0,spchar=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			
			if(ch>='a'&&ch<='z')
				alp++;
			else if(ch>='0'&&ch<='9')
				digit++;
			else if(ch==' ')
				space++;
			else 
				spchar++;
		}
		System.out.println("no of alphabet   "+alp);
		System.out.println("no of digits  "+digit);
		System.out.println("no of special character  "+spchar);
		System.out.println("no of space  "+space);
	}
}
