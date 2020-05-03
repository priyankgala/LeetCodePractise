/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Day 2: Challenge
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  
Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. 
Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */

public class D2JewelsandStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aaaAAAAbbbb";

        System.out.println("No of stones that are jewels are: " + numJewelsInStones(J, S));
    }

    private static int numJewelsInStones(String J, String S) {

        int result = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < S.length(); i++) {
            Character c = S.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("Map formed is: "+map);
        
        for(int j=0;j<J.length();j++){
            if(map.containsKey(J.charAt(j))){
                result += map.get(J.charAt(j));
            }else
            {
                continue;
            }
        }
        
        System.out.println("Result calculated is: "+result);
        return result;
    }

}
