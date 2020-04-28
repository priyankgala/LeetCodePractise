/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.Random;

/**
 *
 * @author kinja
 */
public class TestClass {

    public static void main(String args[]) {
        int max = 26;
        int min = 1;
        int range = max - min + 1;
        Random rnd = new Random();
        // generate random numbers within 1 to 10 
        for (int i = 0; i < 28; i++) {
            
            char c = (char) (rnd.nextInt(26) + 'a');
            System.out.println(""+c);
        }
    }
}
