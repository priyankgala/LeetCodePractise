/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.HashMap;
import java.math.*;
import java.util.*;
import java.util.Set;

/**
 *
 * @author Priyank
 */
public class missingNumber {

    public static void main(String[] args) {

        //int[] A = {6,2,1,5,6,4,3,9,8, 3,3,4,6};
        //int[] A = {-1,-3};
        int[] A = {2021, 2022, 2025, 2026, 2024, 2028};
//        int[] A = {1,2,3};
        int arr[] = new int[A.length+1];
        
        for(int i:A)
        {
            if(i>=1 && i<=A.length)
                arr[i]=1;   
        }
        
        System.out.println("-----------------------------------------------------------------------");
        
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
               System.out.println(arr[i]+" = is missing in Array of arr+ "+i);
               break;
        }
        
        System.out.println(""+(A.length+1)); 
        
    }

}
