package PractiseLeetCode;

public class Leetcode283_Move_Zeros {
    public static void main(String args[]){
        int[] nums = {0,1,0,3,12};
        
        nums = moveZeros(nums);
        
        for(int i: nums){
            System.out.print(" "+i);
        }
        System.out.println("");
    }

    private static int[] moveZeros(int[] nums) {
        
        int index =0;
        
        for(int i =0; i<nums.length;i++){
            if(nums[i] != 0) {
              nums[index++] = nums[i];   
            }
        }
        
        for(int i= index; i<nums.length; i++){
            nums[i] = 0;   
        }
        
        return nums;
    }
    
}
