package com.leetcode.palindrome;


import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number for detection:");
        int x = input.nextInt();
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int workX = x;
        int polindrom = 0;
        if ((x < 0) || (x == 10)) return false;
        else if (x < 10) {
            return true;
        } else {
            while (workX >= 10 ){
                polindrom = polindrom * 10;
                polindrom = polindrom + workX % 10;
                workX = workX / 10;
            }
            polindrom = polindrom * 10 + workX;
            if (x == polindrom)
                return true;
            else return false;
        }
    }
}
