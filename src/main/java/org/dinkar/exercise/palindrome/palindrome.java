package org.dinkar.exercise.palindrome;

public class palindrome {


    public void cheackPalindrome(String str) {
        char strChar[]  = str.toCharArray();
        int strCharLength = strChar.length;
        boolean isPalindrome = false;
        for(int i = 0; i< strCharLength; i++) {
            if(strChar[i] == strChar[strCharLength  -i -1]) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        System.out.println("Is " + str +" palindrome = " + isPalindrome);
    }
}
