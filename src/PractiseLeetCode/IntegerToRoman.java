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
public class IntegerToRoman {

    public static void main(String args[]) {

        int num = 1;
        int n = String.valueOf(num).length();
        int value = 0;
        String result = "";
        for (int i = 0; i < n; i++) {
            value = (int) ((num % 10) * Math.pow(10, i));
            num = num / 10;
            System.out.println("Value is: " + value);

            switch (value) {
                case 1:
                    result = "I" + result;
                    break;

                case 2:
                    result = "II" + result;
                    break;

                case 3:
                    result = "III" + result;
                    break;

                case 4:
                    result = "IV" + result;
                    break;

                case 5:
                    result = "V" + result;
                    break;

                case 6:
                    result = "VI" + result;
                    break;

                case 7:
                    result = "VII" + result;
                    break;

                case 8:
                    result = "VIII" + result;
                    break;

                case 9:
                    result = "IX" + result;
                    break;

                case 10:
                    result = "X" + result;
                    break;
                default:
                    break;

            }

            System.out.println("Result is: " + result);
        }
    }
}
