/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.HashMap;
import java.util.Map;

/*
Leetcode problem 997
In a town, there are N people labelled from 1 to N.  
There is a rumor that one of these people is secretly the town judge.

If the town judge exists, then:

The town judge trusts nobody.
Everybody (except for the town judge) trusts the town judge.
There is exactly one person that satisfies properties 1 and 2.
You are given trust, an array of pairs trust[i] = [a, b] 
representing that the person labelled a trusts the person labelled b.

If the town judge exists and can be identified, return the label of the town judge.  Otherwise, return -1.

 
 */
public class D10FindTheJudge {

    public static void main(String args[]) {
//        int[][] trust = {{1, 3}, {2, 3}, {3, 1}};

        int[][] trust = {{1, 2}, {2, 3}, {1, 3}};
        System.out.println("Trust array lenght is: " + trust.length);
        int N = 3;

        System.out.println("Judge is: " + findJudge(N, trust));
    }

    private static int findJudge(int N, int[][] trust) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < trust.length; i++) {
           map.put(trust[i][0], map.getOrDefault(trust[i][0], 0) - 1);
           map.put(trust[i][1], map.getOrDefault(trust[i][1], 0) + 1);
        }
        
        int key = -1;
        for (Map.Entry entry : map.entrySet()) {
            int val = (Integer) entry.getValue();
            if (val == (N - 1)) {
                key = (Integer) entry.getKey();
            }
        }
        System.out.println("Map created is: " + map);
        return key;
    }
}
