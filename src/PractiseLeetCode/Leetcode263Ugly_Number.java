package PractiseLeetCode;

public class Leetcode263Ugly_Number {

    public static void main(String args[]) {
        int num = 17;

        System.out.println("Number " + num + " is an UGLY NUMBER: " + isUgly(num));
    }

    private static boolean isUgly(int num) {

        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }

        while (num != 1) {
            if(num % 2 == 0) num /=2;
            else if(num % 3 == 0) num /=3;
            else if(num % 5 == 0) num /=5;
            else return false;
        }

        return true;
    }
}
