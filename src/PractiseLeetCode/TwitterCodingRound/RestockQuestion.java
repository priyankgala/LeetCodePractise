/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode.TwitterCodingRound;

import java.util.ArrayList;

/**
 *
 * @author kinja
 */
public class RestockQuestion {

    public static void main(String[] args) {
        int target = 80;
        ArrayList<Integer> itemCount = new ArrayList<>();
        int total = 0;
        int itemList = itemCount.get(0);
        for (int i = 0; i < itemCount.size(); i++) {
            total = total + itemCount.get(i);
            if (total >= target) {
                System.out.println("" + (total - target));
            }

        }
        System.out.println("" + (target - total));
    }
}
