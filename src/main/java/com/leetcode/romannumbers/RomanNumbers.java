package com.leetcode.romannumbers;

import java.util.HashMap;
import java.util.Scanner;


public class RomanNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input roman number");
        String romanNumeral = input.nextLine();
        Integer result = romanToInt(romanNumeral);
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        s = s.toUpperCase();
        HashMap<Character, Integer> romanic = new HashMap<Character, Integer>();
        romanic.put('I', 1 );
        romanic.put('V', 5 );
        romanic.put('X', 10 );
        romanic.put('L', 50 );
        romanic.put('C', 100 );
        romanic.put('D', 500 );
        romanic.put('M', 1000 );

        int result = 0;
        int currentPosition = s.length() - 1;
        char currentRoman;
        Integer currentNumber = 0;
        Integer predNumber = 0;

        while (currentPosition >= 0){
            currentRoman = s.charAt(currentPosition);
            currentNumber = romanic.get(currentRoman);
            if (currentNumber >= predNumber)
                result += currentNumber;
            else result -= currentNumber;
        currentPosition --;
        predNumber = currentNumber;
        }
        return result;
    }
}