package com.leetcode.twosumm;


import java.util.Scanner;

public class TwoSumm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input length of massive:");
        int l = input.nextInt();
        int[] nums = new int[l];
        System.out.println("Input element of massive as one:");
        for (int i = 0; i < l; i++) {
            nums[i] = input.nextInt();
        }
        System.out.println("Input target num");
        int target = input.nextInt();
        System.out.println("Result is:");
        int[] result = new int[2];
        result = twoSum(nums, target);
        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else System.out.println("There are not theses subjects");
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }
}
