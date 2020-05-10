/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

/**
 *
 * @author kinja
 */
public class D9ValidPerfectSquare {

    public static void main(String args[]) {

        int num = 1;

        System.out.println("Is valid perfect square? " + isPerfectSquare(num));
    }

    private static boolean isPerfectSquare(int num) {

//        long l = 1;
//        long r = num;
//        
//        while (l <= r) {
//            long mid = l - (l - r) / 2;
//            System.out.println("Start is: " + l + " and end is: " + r);
//            System.out.println("Mid is: " + mid);
//            if (mid * mid == num)
//                return true;
//            else if (mid * mid < num)
//                l = mid + 1;
//            else
//                r = mid - 1;
//        }
//        
        long start = 1;
        long end = num;

//        if (num == 1) {
//            return true;
//        }

        while (start <= end) {
            long mid = start + (end - start) / 2;
            System.out.println("Start is: " + start + " and end is: " + end);
            System.out.println("Mid is: " + mid);
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
