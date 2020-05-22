/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

import java.util.Arrays;
import java.util.PriorityQueue;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author kinja
 */
public class D22SortCharByFrequency {

    public static void main(String args[]) {

        String s = "aaccccbbbAAAAAAA";
//        Arrays.sort(s.toCharArray());
//        System.out.println(s);

        System.out.println("Sorting based on Frequency");
        System.out.println("Answer is: " + frequencySort(s));
    }

    private static String frequencySort(String s) {

        int[] arr = new int[256];
        for (char c : s.toCharArray()) {
            arr[c]++;
        }
        
//        for(int i=0; i<arr.length;i++){
//            System.out.println(""+arr[i]);
//        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> arr[b] - arr[a]);  
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                pq.add((char) i);    
            }
        }
//        System.out.println("Priority queue created is: "+pq);
        String result = "";
        while(!pq.isEmpty()){
            char c = pq.remove();
            for (int i = 0; i < arr[c]; i++) {
                result = result + c;
            }
            
        }
        
        return result;
    }

}
