
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
public class D12FindtheDifference {

    public static void main(String args[]) {
        System.out.println("Different character is" + diff("car", "cart"));
    }

    private static Character diff(String s, String t) {
        char ch = ' ';
        if (s.length() == t.length()) {
            return ch;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return c;
            }
        }
        return ch;
    }

}
