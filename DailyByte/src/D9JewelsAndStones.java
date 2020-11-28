
import java.util.HashMap;

/*
This question is asked by Amazon. Given a string representing your stones and another string representing a list 
of jewels, return the number of stones that you have that are also jewels.

Ex: Given the following jewels and stones...

jewels = "abc", stones = "ac", return 2
jewels = "Af", stones = "AaaddfFf", return 3
jewels = "AYOPD", stones = "ayopd", return 0
*/
public class D9JewelsAndStones {
    public static void main(String args[]){
        
        String jewels = "abc";
        String stones = "ac";
        
        System.out.println("No. of stones that are jewels are: "+jewelsAndStones(jewels, stones));
    }

    private static int jewelsAndStones(String jewels, String stones) {
       
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for(Character c: stones.toCharArray()){
//            if(jewels.toCharArray().){
//                map.add(c, map.getOrDefault(c, 0)+1);
//            }
        }
        return 0;
    }
    
}
