/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kinja
 */
public class GroupSort {
    
    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        
        System.out.println("Sorted list is: "+groupSort(arr));
    }

    private static List<List<Integer>> groupSort(List<Integer> arr) {
        
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        System.out.println("Map"+map);
        
        int c = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            List<Integer> l = new ArrayList<>();
            l.add(entry.getKey());
            l.add(entry.getValue());
            list.add(l);
        }
        
        return list;
    }
        
}
