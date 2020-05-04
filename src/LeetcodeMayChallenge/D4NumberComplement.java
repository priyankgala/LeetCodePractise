/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

/*
Day 4:
Given a positive integer, output its complement number. 
The complement strategy is to flip the bits of its binary representation.

 */
public class D4NumberComplement {

    public static void main(String args[]) {

        System.out.println("Answer is :" + numberComplement(1));
    }

    private static int numberComplement(int i) {
        String number = Integer.toBinaryString(i);
//        System.out.println("Binary form is: " + number);
        String result = "";
        char[] ch = number.toCharArray();
        for (int j = 0; j < ch.length; j++) {
//         System.out.println("Character value are: "+ch[j]);
            int num = ch[j] == '1'? 0:1; 
            result += num;
        }
        
        int res = Integer.parseInt(result,2);

        return res;
    }
}
