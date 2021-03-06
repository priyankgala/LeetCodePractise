/*
This question is asked by Google. You are given two strings, s and t which only consist of lowercase letters. 
t is generated by shuffling the letters in s as well as potentially adding an additional random character. 
Return the letter that was randomly added to t if it exists, otherwise, return ’ ‘.

Note: You may assume that at most one additional character can be added to t.

Example: 
s = "foobar", t = "barfoot", return 't'
s = "ide", t = "idea", return 'a'
s = "coding", t "ingcod", return ''

*/

public class SpotTheDifference {
    public static void main(String args[]){
    
        String s = "abcd";
        String t = "abcde";
        
        System.out.println(differnceIs(s,t));
    }

    private static char differnceIs(String s, String t) {
        
        int sSum = 0;
        int tSum = 0;
        
        for(int i=0; i<t.length();i++){
            sSum = i> s.length()-1? sSum : sSum+s.charAt(i);
            tSum += t.charAt(i);
        }
        
        return (char)(tSum-sSum);
    }
}
