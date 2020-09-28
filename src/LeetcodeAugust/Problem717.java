/*

We have two special characters. The first character can be represented by one bit 0. 
The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. 
The given string will always end with a zero.

Example 1:
Input: 
bits = [1, 0, 0]
Output: True
Explanation: 
The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.*/

package LeetcodeAugust;


public class Problem717 {
    
    public static void main(String args[]){
    
        int[] arr = {1, 0 ,1,0};
        System.out.println(isOneBitCharacter(arr));
        
        
    }

    private static boolean isOneBitCharacter(int[] arr) {
       
        int n = arr.length - 2;
        while(n >= 0 && arr[n]>0)
            n--;
        
        return (arr.length-n)%2 == 0;
        
//                for(int i =0; i<arr.length;){
//            if(arr[i] == 0){
//                if(i == arr.length -1) return true;
//                i +=1;
//            }
//            else 
//                i +=2;
//            
//        }
//         return false;

    }
    
}
