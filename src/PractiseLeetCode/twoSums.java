/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author kinjal
 */
import java.util.*;

public class twoSums {

    public static void main(String args[]) {
        int a[] = {3,3};
        int target = 26;

        int result[] = new int[a.length];

        result = twoSums(a, target);
        
        for(int n: result){
            System.out.println(""+n);
        }

    }

    public static int[] twoSums(int[] a, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int answer[] = new int[2];
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(target - a[i])) {
                int x = map.get(target-a[i]);
                answer[0] = x;
                answer[1] = i;                

            } else {
                map.put(a[i], i);
            }
        }
        System.out.println("" + map);
        
        
        return answer;

    }

}
