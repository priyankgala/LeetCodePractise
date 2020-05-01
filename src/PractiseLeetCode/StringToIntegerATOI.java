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
        String str = "-2147483648";
        System.out.println("Output is: " + atoi(str));
    }

    private static int atoi(String str) {
        char[] ar = str.toCharArray();
        int i = 0, n = ar.length;
        boolean positive = true;

        while (i < ar.length && ar[i] == ' ') {
            i++;
        }
        if (i == n) {
            return 0;
        }

        if (ar[i] == '+') {
            i++;
        } else if (ar[i] == '-') {
            positive = false;
            i++;
        } else if (!Character.isDigit(ar[i])) {
            return 0;
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        long result = 0;
        while (i < n && Character.isDigit(ar[i])) {
            int value = Character.getNumericValue(ar[i]);
            if (positive) {
                result = result > max ? max : result;
                System.out.println(""+result);
            } else {
                result = result < min ? min : result;
                System.out.println(""+result);
            }
            result = result * 10 + value;
            ++i;

        }
        System.out.println("Result is:" + result);
        if (!positive) {
            System.out.println("Negative");
            return (int) result * -1;
        }
        return (int) result;

    }

}
