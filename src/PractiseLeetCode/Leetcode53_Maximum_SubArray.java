package PractiseLeetCode;

public class Leetcode53_Maximum_SubArray {

    public static void main(String args[]) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum subarray sum is: " + maxSubArr(arr));
    }

    private static int maxSubArr(int[] nums) {
        int current = 0, max =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            current = current + nums[i];
            System.out.println(current+ " and "+max);
            if(max < current){
                max = current;
            }
            
            if(current< 0){
                current = 0;
            }
        }
        
        return max;
    }
}
