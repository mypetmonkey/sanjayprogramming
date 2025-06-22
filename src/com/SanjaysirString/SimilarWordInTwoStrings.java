package com.SanjaysirString;

import java.util.*;


public class SimilarWordInTwoStrings {
	
	public static void main(String[] args) {

       String str1="ram is a good boy";
       String str2="Shyam is a bad boy";
       
      String[] s1 = str1.split(" ");
      String[] s2 = str2.split(" ");
        Set<String> words1 = new HashSet<>(Arrays.asList(s1));
        Set<String> words2 = new HashSet<>(Arrays.asList(s2));

        // Find common words
        words1.retainAll(words2);

        // Display result
        if (words1.isEmpty()==false) {
            System.out.println("Similar words: " + words1);
        } else {
            System.out.println("No similar words found.");
        }

	}

}
