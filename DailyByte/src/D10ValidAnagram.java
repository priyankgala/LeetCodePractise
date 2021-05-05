
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class D10ValidAnagram {

    public static void main(String args[]) {

        String s = "catt";
        String t = "tac";

        System.out.println("Is Valid anagram?" + validAnagram(s, t));
    }

    private static Boolean validAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(Character c: t.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c)-1);
            }else{
                return false;
            }
        }
        return true;
    }
}
