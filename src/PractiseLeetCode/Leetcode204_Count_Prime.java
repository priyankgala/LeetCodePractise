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
public class Leetcode204_Count_Prime {
    
    public static void main(String args[]){
    
        int num = 40;
        System .out.println(countPrimes(num));
    }

    private static int countPrimes(int num) {
        
        boolean[] arr = new boolean[num];
        int count =0;
        
        for(int i=2; i*i < arr.length; i++){
            if(!arr[i]){
                for(int j= i; j*i < arr.length; j++){ 
                    arr[i*j] = true;
                }
            }
        }
        
        for(int i=2; i < arr.length; i++){
           if(!arr[i]) count++;
        }
        
        
        
        return count;
    }
}
