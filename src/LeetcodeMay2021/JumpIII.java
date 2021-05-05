/*
Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
Each element in the array represents your maximum jump length at that position.
Your goal is to reach the last index in the minimum number of jumps.
You can assume that you can always reach the last index.

Example: 
Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. 
Jump 1 step from index 0 to 1, then 3 steps to the last index.


Input: nums = [2,3,0,1,4]
Output: 2

Tag: Array , Grredy
 */
package LeetcodeMay2021;

public class JumpIII {
    public static void main(String args[]){
        int[] arr = {2,3,1,1,4};
        int result = jump(arr);
        System.out.println("Result is: "+result);
    }

    private static int jump(int[] nums) {
        int count = 0;
        int start = 0;
        int end = 0;
        
        for(int i=0;i<nums.length-1;i++){
            end = Math.max(end, nums[i]+i);
//            System.out.println(end);
            if(i == start){
                count++;
                start = end;
                
                if(start > nums.length) break;
            }
        }
        
        return count;
    }
}
