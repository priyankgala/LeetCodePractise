/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRandFolder;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kinja
 */

public class NonDivisibleSubSet {
    public static void main(String args[]){
    
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        s.add(1);
        int k = 5;
        
        int N = s.size();
        int f[] = new int[k]; 
        Arrays.fill(f, 0); 
        
        for (int i = 0; i < N; i++) 
            f[s.get(i) % k]++; 

        if (k % 2 == 0) 
            f[k/2] = Math.min(f[k/2], 1); 
        
        int res = Math.min(f[0], 1); 

        for (int i = 1; i <= k/2; i++) 
            res += Math.max(f[i], f[k-i]); 
      
        System.out.println(""+res);
    }
    
}
