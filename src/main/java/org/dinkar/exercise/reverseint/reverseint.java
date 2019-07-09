package org.dinkar.exercise.reverseint;

public class reverseint {

    public void reverseIntUsingStringArr(int num) {
        int sign = num < 0 ? -1 : 1;
        num = num * sign;
        String numString = String.valueOf(num);
        int numStringLength = numString.length();
        char numStringCharArr[] = new char[numStringLength];
        numStringCharArr = numString.toCharArray();
        String revString = "";
        for(int i = 0; i < numStringLength; i++) {
            revString = revString + numStringCharArr[numStringLength -i -1];
        }
        int revInt = Integer.parseInt(revString) * sign;
        System.out.println(revInt);
    }


    public void reverseIntUsingModuloAndDevide(int num) {
        int reveseInt = 0;
        int sign  = num >  0 ? 1 : -1;
        num = num * sign;
        while(num > 0) {
            reveseInt = (reveseInt*10) + num%10;
            num = num/10;
        }
        System.out.println(reveseInt*sign);
    }

}
