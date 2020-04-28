/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.*;

/**
 *
 * @author Priyank
 */
public class testHashMap {
    
    public static void main(String args[])
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = 20;
        for(int i =1; i<=n ; i++)
        {
            if(i%3==0)
            {
                map.put(i,3);
            }
            else if (i%4 == 0)
            {
                map.put(i,4);
            }
            else
            {
                map.put(i,1);
            }
        }
        System.out.println("Unsorted map"+map);
        System.out.println("\n");
        
//        System.out.println("Printing Maps entry set "+map.entrySet());
//        System.out.println("\n");
        
        List<Map.Entry<Integer, Integer> > list = 
                 new LinkedList<Map.Entry<Integer, Integer>> (map.entrySet());         
        System.out.println("List created is: "+list);
        System.out.println("\n");
        
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() { 
            public int compare(Map.Entry<Integer, Integer> o1,  
                               Map.Entry<Integer, Integer> o2) 
            { 
                return (o2.getValue()).compareTo(o1.getValue()); 
            } 
        }); 
        
        System.out.println("List after applying comparator is:" +list);
        System.out.println("\n");
        
        
        // put data from sorted list to hashmap  
        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>(); 
        for (Map.Entry<Integer, Integer> aa : list) { 
            temp.put(aa.getKey(), aa.getValue()); 
        } 
        
        System.out.println("Sorted map is: " +temp);
        System.out.println("\n");
        
        
        //taking the highest two values from the map
        int noOfValues =2;
        int count = 0;
        int maxValue=0;
        
        System.out.println("Highest Keys are as follows:");
        for(int values: temp.values())
        {
            if(count < noOfValues)
            {
                if(maxValue!=values)
                {
                ++count;
                maxValue = values;
                System.out.println(" "+temp.get(values));
                }
                else
                {
                       System.out.println(" "+temp.get(values));
                }
            }
            
            
        }
    }
    
}
