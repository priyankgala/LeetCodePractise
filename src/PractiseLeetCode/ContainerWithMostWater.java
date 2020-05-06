/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

public class ContainerWithMostWater {

    public static void main(String args[]) {

        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println("Container can hold maximum of" + maxArea(arr));
    }

    private static int maxArea(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length -1;

        if (arr.length < 2) {
            return 0;
        }

        while (left < right) {

            max = Math.max(max, (right - left) * Math.min(arr[left], arr[right]));
            System.out.println("Left value is: "+left+ " and right value is: "+right);
            System.out.println("Left Height value is: "+arr[left]+ " and right value is: "+arr[right]);
            System.out.println("Max value is: "+max);
            System.out.println("-----------------------------------------------------------------------------------");
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        }
        
        
        return max;

    }

}
