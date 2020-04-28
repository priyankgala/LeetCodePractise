/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode.TwitterCodingRound;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author kinja
 */
public class UniquePalindrome {

    static Set<String> set = new HashSet<>();

    public static void main(String[] args) {

        // Write your code here
        String s = "abccssjaajd";
        for (int i = 0; i < s.length(); i++) {
            pal(s, i, 0);
            pal(s, i, 1);
        }
         System.out.println(set);
         System.out.println(Collections.max(set));
        System.out.println("" + set.size());
    }

    public static void pal(String s, int start, int offset) {
        int l = start;
        int r = start + offset;

        while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {
            set.add(s.substring(l, r + 1));
            r++;
            l--;
        }
        // System.out.println(set);
    }

}
