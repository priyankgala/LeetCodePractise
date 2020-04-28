/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinja
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "bcabacd";
        int n = s.length();
        int len = 0, start =0, end=0;
//        List<String> result = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int len1 = palindrome(s, i, i);
            int len2 = palindrome(s, i, i + 1);
            len = Math.max(len1, len2);
            if(len > end-start){
                start = i - (len-1)/2;
                end = i+ (len/2);
            }
        }
        //Output of longest palindromic string
        System.out.println(""+s.substring(start, end+1));
    }

    static int palindrome(String s, int start, int end) {

        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end-start-1;
    }

}
