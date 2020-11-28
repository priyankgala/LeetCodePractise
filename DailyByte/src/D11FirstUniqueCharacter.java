
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinja
 */
public class D11FirstUniqueCharacter {

    public static void main(String args[]) {
        String s= "leetcode";
        System.out.println("First character is: "+ firstUniqChar(s));
        
    }
    public static int firstUniqChar(String leetcode) {
     int n = leetcode.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            Character c = leetcode.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < n; i++) {
            Character c = leetcode.charAt(i);
            int occurence = map.get(c);
            if(occurence == 1){
                return i;
            }
        }

        return -1;   
    }

}
