package com.SanjaysirString;

public class MostReapetingChar {
	
	static char mostRepeatingChar(String st) {
        int max=0;
        char ch= st.charAt(0);
        for(int i=0;i<st.length();i++) {
            int count=0;
            for(int j=0;j<st.length();j++) {
                if(st.charAt(i)==st.charAt(j)) 
                    count++;
                  }
            if(count>max) {
                max=count;
               ch= st.charAt(i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String str = "abcaabcc";
        char ch = mostRepeatingChar(str);
        System.out.println(ch);
    }

}
