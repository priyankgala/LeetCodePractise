/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author kinja
 */
public class LongestPalindromicStringBruteForce {

    public static void main(String[] args) {
        String s = "bbbcb";
        int n = s.length();
        int start = 0, end=0, maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    int len = s.substring(i, j+1).length();
                    maxLength = Math.max(maxLength, len);
                    if(maxLength > end-start){
                     start = i- (maxLength-1)/2;
                     end= i+ maxLength/2;
                    }
                } 
            }
        }
        System.out.println(""+s.substring(start, end+1));
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
