/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kinja
 */
public class D17AllAnagramsinString {

    public static void main(String args[]) {

        String s = "cbaebabacd";
        String p = "abc";

        ArrayList result = new ArrayList();

        result = findAnagrams(s, p);
        System.out.println("Result is: " + result);
    }

    private static ArrayList findAnagrams(String text, String pattern) {
        ArrayList result = new ArrayList();
//        int slen = text.length();
//        int plen = pattern.length();
//        
//        for(int i=0; i<= slen-plen;i++){
//        
//            String s1 = text.substring(i, i+plen);
////            System.out.println(pattern+ " is to check and Substring is: "+s1);
////            System.out.println(s1);
//
//            char[] tchar = s1.toCharArray();
//            char[] pchar = pattern.toCharArray();
//            
//            Arrays.sort(tchar);
//            Arrays.sort(pchar);
//            
//            for(int j=0;j<tchar.length;j++){
//                System.out.println("Text array is: "+tchar[j] + " and value is pattern char is: "+pchar[j]);
//            }
//            boolean status = Arrays.equals(tchar, pchar);
//            
//            if(status){
//                result.add(i);
//            }
//        }
//        return result;

        if (text.length() == 0 || text == null) {
            return result;
        }
        int[] char_Count = new int[26];

        for (char c : pattern.toCharArray()) {
            char_Count[c - 'a']++;
        }
        
        int start = 0, end = 0;
        int count = pattern.length();
        
        while(end < text.length()){
            
            if(char_Count[text.charAt(end++) - 'a']-- >= 1) count --;
            if(count == 0) result.add(start);
            if(end-start == pattern.length() && char_Count[text.charAt(start++) - 'a']++ >=0) count++;
        
        }

        return result;

    }
}
