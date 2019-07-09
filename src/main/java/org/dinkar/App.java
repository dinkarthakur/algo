package org.dinkar;

import org.dinkar.exercise.palindrome.palindrome;
import org.dinkar.exercise.reverseint.reverseint;
import org.dinkar.exercise.reversestring.reversestring;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        reversestring revStr = new reversestring();
        System.out.println("===Reverse String using another Array===");
        revStr.reverseStringByNewArray("dinkar");
        revStr.reverseStringUsingSwapping("shankar");
        revStr.reverseStringByNewArray("Greetings!");
        System.out.println("===Reverse String using another Array===");

        System.out.println("===Reverse String using string concat===");
        revStr.reverseStringByStringConcat("dinkar");
        revStr.reverseStringUsingSwapping("shankar");
        revStr.reverseStringByStringConcat("Greetings!");
        System.out.println("===Reverse String using string concat===");

        System.out.println("===Reverse String using swapping===");
        revStr.reverseStringUsingSwapping("dinkar");
        revStr.reverseStringUsingSwapping("shankar");
        revStr.reverseStringUsingSwapping("Greetings!");
        System.out.println("===Reverse String using swapping===");



        System.out.println("===Reverse integer using String conversion===");
        reverseint reverseint = new reverseint();
        reverseint.reverseIntUsingStringArr(61);
        reverseint.reverseIntUsingStringArr(-1290);
        System.out.println("===Reverse integer using String conversion===");

        System.out.println("===Reverse integer using Modulo and divide");
        reverseint.reverseIntUsingModuloAndDevide(92);
        reverseint.reverseIntUsingModuloAndDevide(-92);
        System.out.println("===Reverse integer using Modulo and divide");

        System.out.println("===Find palindrome using compare value  ===");
        palindrome palindrome = new palindrome();
        palindrome.cheackPalindrome("1217");
        palindrome.cheackPalindrome("abbc");
        palindrome.cheackPalindrome("abba");
        palindrome.cheackPalindrome("abc");
        palindrome.cheackPalindrome(" aba ");
        System.out.println("===Find palindrome using compare value  ===");

    }
}
