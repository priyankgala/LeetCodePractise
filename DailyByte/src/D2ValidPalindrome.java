/*
This question is asked by Facebook. Given a string, return whether or not it forms a palindrome ignoring 
case and non-alphabetical characters.
Note: a palindrome is a sequence of characters that reads the same forwards and backwards.

Ex: Given the following strings...

"level", return true
"algorithm", return false
"A man, a plan, a canal: Panama.", return true
*/

public class D2ValidPalindrome {
    public static void main(String args[]){
    
        String str = "A man, a plan, a canal: Panama.";
//        System.out.println(""+Character.toLowerCase('*'));
        
        System.out.println("Is Palindrome? "+isPalindrome(str));
        
    }

    private static Boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        char[] arr = str.toCharArray();
        
        while(start <=end){
            if(!Character.isLetter(arr[start])){
                start++;
            }else if(!Character.isLetter(arr[end])){
                end--;
            }
            else if(Character.toLowerCase(arr[start++]) != Character.toLowerCase(arr[end--])){
                return false;
            }
                
        }
        
        
        return true;
    }
    
}
