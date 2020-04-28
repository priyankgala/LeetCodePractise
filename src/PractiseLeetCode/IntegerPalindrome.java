/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author kinja
 */
public class IntegerPalindrome {
    
    public static void main(String args[]){
    
        System.out.println(""+ isPalindrome(121));
    }
    
     public static boolean isPalindrome(int x) {
        int result = 0;
        if(x < 0 || x%10 == 0 && x!= 0){
            return false;
        }
        int num = 0;
        while(x > num){
            num = num*10 + x%10;
            x = x/10;  
        }
        
        return (x == num || x == num/10);
    }
    
    
}
