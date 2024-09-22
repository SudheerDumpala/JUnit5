package com.Junit5_02;

/* To Find whether The given number is palindrome or Not */

import java.util.InputMismatchException;
public class StringReverse {
    public String stringReversing(String word) {
        try{
            int n = word.length();
            String newWord = "";
            for(int i=0;i<n;i++){
                newWord += word.charAt(n-1-i);
            }
            return newWord;
        }
        catch(InputMismatchException e){
            System.out.println("You haven't give the correct type of input");
        }
		return null;
    }
}