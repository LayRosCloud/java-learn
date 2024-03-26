package org.example.numbers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanConverter {

    private final Map<Character, Integer> roman;

    public RomanConverter(){
        roman = new HashMap<>();

        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('L', 50);
        roman.put('X', 10);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
    }

    public int convert(String number){
        char[] romanLetters = number.toCharArray();
        int lastLetterCost = -10000;
        int sum = 0;

        for (int i = romanLetters.length - 1; i >= 0; i--) {
            int cost = roman.get(romanLetters[i]);

            if(cost < lastLetterCost){
                sum -= cost;
            }else{
                sum += cost;
            }

            lastLetterCost = cost;
        }

        return sum;
    }


}
