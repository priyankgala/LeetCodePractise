/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.HashMap;
import java.util.Map;

/*
Day 3: Challenge
Given an arbitrary ransom note string and another string containing letters from all the magazines, 
write a function that will return true if the ransom note can be constructed from the magazines ; 
otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

 */
public class D3RansomNote {

    public static void main(String[] args) {

//        "fffbfg"
//"effjfggbffjdgbjjhhdegh"
        String ransomNote = "fffbfg";
        String magazine = "effjfggbffjdgbjjhhdegh";
        boolean rs = canConstruct(ransomNote, magazine);

        System.out.println("RansomNote can be formed using magazine: " + rs);
    }

    private static boolean canConstruct(String ransomNote, String magazine) {

        boolean result = true;
        if (ransomNote.length() > magazine.length()) {
            return result;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < magazine.length(); i++) {
            Character c = magazine.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println("Map formed is: "+map);
       
        char[] ch = ransomNote.toCharArray();
        for(char character: ch){
            if(map.containsKey(character) && map.get(character) > 0){
                map.put(character, map.get(character)-1);
            }else{
                return false;
            }
        }
        return true;
    }

}
