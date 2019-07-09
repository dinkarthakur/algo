package org.dinkar.exercise.reversestring;

public class reversestring {


    public void reverseStringByNewArray(String str){

        int strLength = str.length();
        char[] strArray = str.toCharArray();
        //String revStr = "";
        char[] revStr = new char[strLength];
        for(int i=0; i<strLength; i++) {
            //revStr  = revStr + strArray[strLength - i -1];
            revStr[i] = strArray[strLength - i -1];
        }
        System.out.println(revStr);
    }

    public void reverseStringByStringConcat(String str) {
        int strLength = str.length();
        char[] strArray = str.toCharArray();
        String revStr = "";
        for(int i=0; i<strLength; i++) {
            revStr  = revStr + strArray[strLength - i -1];
        }
        System.out.println(revStr);
    }

    public void reverseStringUsingSwapping(String str) {
        int strLength = str.length();
        char charArr[] = str.toCharArray();
        for(int i = 0; i < str.length()/2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[strLength -i -1];
            charArr[strLength -i -1] = temp;
        }
        System.out.println(charArr);
    }
}
