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
public class FindSortedMeanInArray {

    public static void main(String args[]) {
        int[] nums1 = {1, 2, 4, 5};
        int[] nums2 = {};
        int m= nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        int start = 0;
        while (m > 0 || n > 0) {
            if (nums1[start] < nums2[start]) {
                result[start] = nums1[start];
                ++start;
                m--;
                n--;

            }
        }

        System.out.println(result);

    }

}
