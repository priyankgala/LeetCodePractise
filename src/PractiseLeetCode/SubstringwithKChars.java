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
public class SubstringwithKChars {

    public static void main(String[] args) {
        String s = "aabab";
        int k = 2;

        List<String> ans = new ArrayList<String>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String tmp = "" + c;
            Set<Character> set = new HashSet<Character>();
            set.add(c);
            for (int j = i + 1; j < s.length(); j++) {
                char nc = s.charAt(j);
                set.add(nc);
                tmp += nc;
                if (tmp.length() >= k && set.size() == k) {
                    ans.add(tmp);
                }
                //System.out.println("Added in Answer "+ans);
            }
        }
        System.out.println("" + ans);
        System.out.println(ans.size());
    }

}
