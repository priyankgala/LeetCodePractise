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

public class ReturnNumberInParticularFashion {

    public static void main(String args[]) {
        int A = 123456;
        // write your code in Java SE 8
        char[] s = (String.valueOf(A)).toCharArray();
        int middle = (s.length - 1) / 2;
        int prev = s.length - 1;
        String ans = "";
        for (int i = 0; i <= middle; i++) {
            if (i == middle && s.length % 2 != 0) {
                ans += s[i];
            } else {
                ans += s[i] + "" + s[prev];
            }
            prev--;
        }
        System.out.println("Answer is "+Integer.parseInt(ans));
    }
}
