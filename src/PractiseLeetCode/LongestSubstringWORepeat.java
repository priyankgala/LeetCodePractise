/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.lang.StringBuilder.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author kinja
 */
public class LongestSubstringWORepeat {

    public static void main(String args[]) {
        String a = "abcabbdbb";
//        String a = "dvdf";
        int ans = lengthOfLongestSubstring(a);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {

//        int n = s.length(), ans = 0;
//        Map<Character, Integer> map = new HashMap<>(); // current index of character
//        // try to extend the range [i, j]
//        for (int j = 0, i = 0; j < n; j++) {
//            if (map.containsKey(s.charAt(j))) {
//                i = Math.max(map.get(s.charAt(j)), i);
//            }
//            ans = Math.max(ans, j - i + 1);
//            System.out.println("Ans value is" + ans);
//            
//            map.put(s.charAt(j), j + 1);
//            
//            System.out.println(""+map);
//        }
//        return ans;\\
        int n = s.length();
        int start = 0;
        int offset = 0;
        String result = "";
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        while (start < n && offset < n) {
            String s1 = Character.toString(s.charAt(offset));
            if (result.contains(s1)) {
                result = "";
                start++;
                offset = start;
            } else {
                result = result + s1;
                if (result.length() > list.get(0)) {
                    list.set(0, result.length());
                }
                System.out.println(result + "         " + list);
                offset++;
            }
        }
        
        return list.get(0);
    }

}
