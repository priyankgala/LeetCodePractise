/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

//Day 1 challenge
/*
You are a product manager and currently leading a team to develop a new product. 
Unfortunately, the latest version of your product fails the quality check. 
Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, 
which causes all the following ones to be bad.
You are given an API bool isBadVersion(version) which will return whether version is bad. 
Implement a function to find the first bad version. You should minimize the number of calls to the API.

 */
public class D1FirstBadVersion {

    public static void main(String args[]) {
        int n = 5, k = 4;
        System.out.println("Output is: " + firstBadVersion(n, k));
    }

    private static int firstBadVersion(int n, int k) {

        int start = 0;
        int end = n;
        System.out.println("" + ((start + end) / 2));
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isBad(mid)) {
                System.out.println("End is changing");
                end = mid;
            } else {
                System.out.println("Start is changing");
                start = mid + 1;
            }
        }

        if (start == end) {
            if (isBad(start)) {
                return start;
            }
        }

        return -1;
    }

    private static boolean isBad(int mid) {
        return mid == 4;
    }

}
