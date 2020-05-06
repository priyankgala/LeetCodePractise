/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kinja
 */
public class D6MajorityElement {

    public static void main(String args[]) {

        int[] num = new int[]{2, 3, 3, 4};

        System.out.println("Majority number is: " + majorityElement(num));
    }

    private static int majorityElement(int[] num) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: num){
            map.put(i, map.getOrDefault(i, 0)+1);     
        }
        int value = Collections.max(map.values());
        int key = 0;
        for(Map.Entry entry: map.entrySet()){
            int val = (Integer)entry.getValue();
            if(val == value){
                key = (Integer)entry.getKey();
            }
        }

        return key;
    }
    

}
