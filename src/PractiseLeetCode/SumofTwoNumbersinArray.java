/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Priyank
 */
public class SumofTwoNumbersinArray {
    
    // "static void main" must be defined in a public class.
    
    public static List<Integer> findPair(List<Integer> nums, int target)
    {
        target = target-30;
        //System.out.println("Target value is: "+target);
        HashMap<Integer, Integer> map = new HashMap<>();
        
        List <Integer>result = Arrays.asList(0,0);
        for(int i=0; i < nums.size(); i++)
        {
            //Checking if sum value is present and the same value is not present in the map
            if(map.containsKey(target-nums.get(i)) && !map.containsKey(nums.get(i)))
            {

                result.set(0, map.get(target-nums.get(i)));
                result.set(1, i);
                break;
            }
            else
            {   
                map.put(nums.get(i),i);
                //System.out.println("Map is: "+map);
            }
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        test(Arrays.asList(1, 10, 25, 35, 60), 90);
        test(Arrays.asList(20, 20, 40, 25, 30, 10), 70);
        test(Arrays.asList(5, 55, 40, 20, 30, 30), 90);
    }
    
    private static void test(List<Integer> nums, int target) {
        System.out.println(findPair(nums, target));
    }

    
}
