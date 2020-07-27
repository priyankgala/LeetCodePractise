package PractiseLeetCode;

import java.util.ArrayList;

public class Leetcode264_Ugly_Number_Part2 {

    public static void main(String args[]) {
        int num = 17;

        System.out.println(num + " UGLY NUMBER is: " + isUgly(num));
    }

    private static int isUgly(int num) {
        int count = 1;
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        int i = 0, j = 0, k = 0;
        while (count != num) {
            int ugly2 = answer.get(i) * 2;
            int ugly3 = answer.get(j) * 3;
            int ugly5 = answer.get(k) * 5;

            int min = Math.min(ugly2, Math.min(ugly3, ugly5));
            answer.add(min);

            if (min == ugly2) {
                i++;
            }
            if (min == ugly3) {
                j++;
            }
            if (min == ugly5) {
                k++;
            }

            count++;

        }

        return answer.get(num - 1);
    }

}
