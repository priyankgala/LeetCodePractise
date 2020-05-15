/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

/*
You are given a sorted array consisting of only integers where every element appears exactly twice, 
except for one element which appears exactly once. Find this single element that appears only once.

Solution should run in O(log n) time and O(1) space.
 */
public class D12SingleElementinSortedArray {

    public static void main(String args[]) {

        int[] nums = {1, 1, 2, 3, 3, 4, 4, 6, 6};
        System.out.println("Single element is: " + noDuplicateElement(nums));
    }

    private static int noDuplicateElement(int[] nums) {

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
