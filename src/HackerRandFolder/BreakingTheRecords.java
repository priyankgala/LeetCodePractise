/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRandFolder;

import java.util.Arrays;

/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. 
She tabulates the number of times she breaks her season record for most points and least points in a game. 
Points scored in the first game establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array . 
Scores are in the same order as the games played. She would tabulate her results as follows:

Example: scores {12,24, 10,24}
lowscore and highscore = scores[0];

 */
public class BreakingTheRecords {

    public static void main(String args[]) {

        int[] scores = {10, 5, 20, 20, 4, 5, 2, 25, 1};

        int[] result = recordsBroke(scores);

        for (int i : result) {
            System.out.println(i);
        }
    }

    private static int[] recordsBroke(int[] scores) {
        int[] result = new int[2];
        Arrays.fill(result, 0);
        int highscore = scores[0], lowscore = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highscore) {
                highscore = scores[i];
                result[0] = result[0] + 1;
            }

            if (scores[i] < lowscore) {
                lowscore = scores[i];
                result[1] = result[1] + 1;
            }
        }

        return result;
    }
}
