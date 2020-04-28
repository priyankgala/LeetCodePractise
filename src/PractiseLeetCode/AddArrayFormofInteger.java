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

public class AddArrayFormofInteger {

    public static void main(String args[]) {
        int k = 34;
        int A[] = {1, 2, 6, 3, 0, 7, 1, 7, 1, 9, 7, 5, 6, 6, 4, 4, 0, 0, 6, 3};
//        int A[] = {0};
        ArrayList<Integer> result = addNumber(A, k);

        System.out.println("" + result);
    }
    private static ArrayList<Integer> addNumber(int[] A, int k) {

        int carry = 0, sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int count = A.length;
        while (count > 0 || carry > 0 || k > 0) {
            if (count <= 0) {
                sum = k % 10 + carry;
            } else {
                sum = A[count - 1] % 10 + k % 10 + carry;
            }
            k = k / 10;
            list.add(sum % 10);
            carry = sum / 10;
            count--;
        }
        Collections.reverse(list);
        return list;
    }

}
