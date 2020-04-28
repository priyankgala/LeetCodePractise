/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author Priyank
 */
import java.util.*;

public class first {
    public static void main(String[] args)
    {
    int A[] = {0,1,1,0};
        int a1[] = new int[A.length];
        int a2[] = new int[A.length];
        int prev1 = 1;
        int prev2 = 0;
        for(int i=0; i < A.length; i++) {
            a1[i] = prev1;
            a2[i] = prev2;
            prev1 = a1[i] == 0? 1: 0;
            prev2 = a2[i] == 0? 1: 0;
        }
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0; i<A.length; i++) {
            if(a1[i] != A[i])
                count1++;
            if(a2[i] != A[i])
                count2++;
        }
    }
    
}
