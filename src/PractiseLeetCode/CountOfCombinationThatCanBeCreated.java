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

public class CountOfCombinationThatCanBeCreated {

    public static void main(String args[]) {
        // you can also use imports, for example:

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
        // write your code in Java SE 8
        String S = "BAONXXOLL";
        Map<Character, Integer> map = new HashMap<>();
        map.put('B',0);
        map.put('A',0);
        map.put('L',0);
        map.put('O',0);
        map.put('N',0);
        
        for (char c : S.toCharArray()) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                count++;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
            
            
        }
        System.out.println("Map created is: " + map);
        
        char[] characters = {'B', 'A', 'L', 'O', 'N'};
        int min = Integer.MAX_VALUE;
        
        for (char c : characters) {
            int t;
            if (c == 'L' || c == 'O') {
                t = map.get(c) / 2;
            } else {
                t = map.get(c);
            }
            if (t < min) {
                min = t;
            }
            else {
                min = 0;
            }
            
            System.out.println(c+" Charater's minimum number is: "+min);

        }
        
        System.out.println("Output is: "+min);

        
    }
}
