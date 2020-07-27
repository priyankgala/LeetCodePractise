package LeetcodeAprilChallenge;

import java.util.Arrays;

/*
Question 1: 

Given a non-empty array of integers, every element appears twice except for one. Find that single one.
Input: [2,2,1]
Output: 1

Input: [4,1,2,1,2]
Output: 4


 */
public class Day1 {

    public static void main(String args[]) {

        int[] nums = {1, 0, 1};
        System.out.println(singleNumber(nums));
    }

    private static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for (int n : nums) {
            System.out.print(n);
        }
        System.out.println("");
        int i = 0;

        while (i < nums.length - 1) {
            if (nums[i] == nums[i + 1]) {
                i = i + 2;
            } else {
                break;
            }
        }

        return nums[i];
    }
}
