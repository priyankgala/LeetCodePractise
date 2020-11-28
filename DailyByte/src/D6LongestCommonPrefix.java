/*
This question is asked by Microsoft. Given an array of strings, return the longest common prefix that is shared amongst all strings.
Note: you may assume all strings only contain lowercase alphabetical characters.

Ex: Given the following arrays...

["colorado", "color", "cold"], return "col"
["a", "b", "c"], return ""
["spot", "spotty", "spotted"], return "spot"
 */
public class D6LongestCommonPrefix {

    public static void main(String args[]) {
        //String[] arr = {"colorado", "color", "cold"};
        String arr[] = {"abcccccccccccc", "abcc", "abccc"};
        System.out.println("Longest common prefix is: " + longestPrefix(arr));
    }

    private static String longestPrefix(String[] arr) {

        String result = arr[0];
        int i = 0;
        while (i < arr[0].length()) {
            for (int j = 1; j < arr.length; j++) {
                if(i == arr[j].length() || result.charAt(i) != arr[j].charAt(i)){
                    return result.substring(0, i);
                }
            }
            i++;
            
        }
        return arr[0];
    }

}
