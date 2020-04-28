/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode.TwitterCodingRound;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author kinja
 */
public class TwitterCodingNoofTokens {

    public static void main(String[] args) {
        int expiryLimit = 4;
        List<List<Integer>> commands = new ArrayList<>();
//        commands.add(0,1,4);
//commands is the list of commands that that will be provided 
        Map<Integer, Integer> tokens = new HashMap<>();
        int time = 0;
        for (List<Integer> c : commands) {
            int action = c.get(0);
            int token = c.get(1);
            time = c.get(2);

            if (action == 0 && !tokens.containsKey(token)) {
                tokens.put(token, time + expiryLimit);
            } else if (action == 1 && tokens.containsKey(token) && tokens.get(token) >= time) {
                tokens.put(token, time + expiryLimit);
            }
        }
        int count = 0;

        for (int t : tokens.values()) {
            if (t >= time) {
                count++;
            }
        }
        //return the count but here since we are writing in main printing it
        System.out.println("Count of tokens is: "+count); 
    }

}

