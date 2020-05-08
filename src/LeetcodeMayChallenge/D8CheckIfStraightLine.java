/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

/*
You are given an array arr, arr[i] = [x, y], where [x, y] represents the coordinate of a point. 
Check if these points make a straight line in the XY plane.
 */
public class D8CheckIfStraightLine {

    public static void main(String args[]) {

//        int[][] arr = {{0, 1}, {1, 3}, {-4, -7}, {5, 11}};
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}};
        System.out.println("Straight line = " + isStraightLine(arr));
    }

    private static boolean isStraightLine(int[][] arr) {
        System.out.println("" + arr.length);
        boolean result = true;

        if (arr.length == 2) {
            return result;
        }

        float m = 0;
        float calcy = arr[1][1] - arr[0][1];
        float calcx = arr[1][0] - arr[0][0];

        m = calcy / calcx;
        System.out.println("M values is: " + m);

        for (int i = 2; i < arr.length; i++) {

            calcy = arr[i][1] - arr[0][1];
            calcx = arr[i][0] - arr[0][0];

            if ((calcy / calcx) == m) {
                continue;
            } else {
                result = false;
                break;
            }
        }

        return result;
    }
}
