/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.HashMap;
import java.util.Map;

/*

Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
 */
public class D5FirstUniqueCharacterInString {

    public static void main(String args[]) {

        System.out.println("Unique element is present at: " + firstUniqChar("aaaaaaaa"));
    }

    private static int firstUniqChar(String leetcode) {

        int n = leetcode.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            Character c = leetcode.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            Character c = leetcode.charAt(i);
            int occurence = map.get(c);
            if(occurence == 1){
                return i;
            }
        }

        return -1;
    }

}
