package org.dinkar.exercise.maxchar;

import java.util.HashMap;
import java.util.Map;

public class maxchar {

    public void findMaxChar(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(char element : str.toCharArray()) {
            if(charCount.containsKey(element)) {
                int newValue = charCount.get(element)+1;
                charCount.put(element, newValue);
            } else {
                charCount.put(element, 1);
            }
        }
        char charmax = '\0';
        int charMaxCount = 0;
        for(Map.Entry<Character, Integer> element : charCount.entrySet()) {
            if(element.getValue() > charMaxCount) {
                charMaxCount = element.getValue();
                charmax = element.getKey();
            }
        }
        System.out.println(charmax + " : " + charMaxCount);
    }


}
