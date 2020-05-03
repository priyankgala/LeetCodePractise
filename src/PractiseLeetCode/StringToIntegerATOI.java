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
import java.util.*;
import java.io.*;

public class StringToIntegerATOI {

    public static void main(String args[]) {
        String str = "+-2";
        System.out.println("Output is: " + atoi(str));
    }

    private static int atoi(String str) {
        char[] ar = str.toCharArray();
        int i = 0, n = ar.length, signCount=0;
        boolean positive = true;
        if (i == n) {
            return 0;
        }
        
        while (i < n && ar[i] == ' ') {
            i++;
        }

        while (i < n && (ar[i] == '+'|| ar[i] == '-')) {
            if(++signCount >1) 
                return 0;
            if(ar[i] == '-') 
                positive = false;
            ++i;
        }
        
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long result = 0;
        while (i < n && Character.isDigit(ar[i])) {
            int value = Character.getNumericValue(ar[i]);
            System.out.println(ar[i]+" Character numeric value is:"+value);
            if(result > max/10 || (result == max/10 && value > 7 )){
                return positive? max:min;
            }
             result = result * 10 + value;
             ++i;
        }
        if (!positive) {
            return (int) result * -1;
        }
        return (int) result;

    }

}
