package PractiseLeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
Question 15: 3 Sum 
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
public class LeetcodeThreeSum {

    public static void main(String args[]) {
        int[] nums = {-1, 0, 1, 2, -1};
        System.out.println(threeSum(nums));
    }

    private static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {

                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if ((nums[low] + nums[high]) == sum) {
                        result.add(Arrays.asList(nums[i], nums[low], nums[high]));
//                        System.out.println(""+result + "and nums[i] is "+i);
                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }

                        low++;
                        high--;
                    } 
                    else if ((nums[low] + nums[high]) > sum) {
                        high--;
                    }else
                        low++;
                }
            }
        }

        return result;
    }
}
