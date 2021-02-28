
public class ReverseVowelsInTheString {

    public static void main(String args[]) {
        System.out.println("Reversed string looks like this: " + reverseVowel("LeetCode"));
    }

    // utility function to check for vowel 
    static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }

// Function to reverse order of vowels 
    static String reverseVowel(String str1) {
        // Storing the vowels separately 
        char[] str = str1.toCharArray();
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            if (isVowel(str[start]) && isVowel(str[end])) {
                char c = str[start];
                str[start++] = str[end];
                str[end--] = c;
            } else if (!isVowel(str[start])) {
                start++;
            }
             else if (!isVowel(str[end])) {
                end--;
            }
        }

        return String.valueOf(str);
    }
}
