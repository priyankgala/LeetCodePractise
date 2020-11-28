/*
This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. 
A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, 
or only the first letter is capitalized.

Ex: Given the following strings...

"USA", return true
"Calvin", return true
"compUter", return false
"coding", return true
*/
public class D4CorrectCapitalization {
    
    public static void main(String args[]){
        String str = "USA";
        
        
        System.out.println("Is correct capitalization used? "+isCorrect(str));   
    }

    private static Boolean isCorrect(String str) {
        int count = 0;
        
        for(int i=0; i<str.length();i++){
            char c= str.charAt(i);
            if(Character.isUpperCase(c))count++;
        }
        return count == str.length() || count == 0 || (count == 1 && Character.isUpperCase(str.charAt(0))) ;
    }
}
