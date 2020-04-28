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
public class RomanToInteger {

    public static void main(String args[]) {

        /*
        Rule:
         There are six instances where subtraction is used:

            I can be placed before V (5) and X (10) to make 4 and 9. 
            X can be placed before L (50) and C (100) to make 40 and 90. 
            C can be placed before D (500) and M (1000) to make 400 and 900.
         */
        System.out.println("" + romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        int value = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length(); ++i) {

            char c = s.charAt(i);
            switch (c) {

                case 'I':
                    if (i != s.length() - 1 && s.charAt(i + 1) == 'V') {
                        i += 1;
                        value += 4;
                    } else if (i != s.length() - 1 && s.charAt(i + 1) == 'X') {
                        i += 1;
                        value += 9;
                    } else {
                        value += 1;
                    }
                    break;

                case 'V':
                    value += 5;
                    break;

                case 'X':
                    if (i != s.length() - 1 && s.charAt(i + 1) == 'L') {
                        i += 1;
                        value += 40;
                    } else if (i != s.length() - 1 && s.charAt(i + 1) == 'C') {
                        i += 1;
                        value += 90;
                    } else {
                        value += 10;
                    }
                    break;

                case 'L':
                    value += 50;
                    break;

                case 'C':
                    if (i != s.length() - 1 && s.charAt(i + 1) == 'D') {
                        i += 1;
                        value += 400;
                    } else if (i != s.length() - 1 && s.charAt(i + 1) == 'M') {
                        i += 1;
                        value += 900;
                    } else {
                        value += 100;
                    }
                    break;

                case 'D':
                    value += 500;
                    break;

                case 'M':
                    value += 1000;
                    break;
            }
        }

        return value;

    }

}
