/*

*/
public class D7ValidPalindromeWithRemoval {
    
    public static void main(String args[]){
        
        String str = "abcdddda";
        System.out.println("String is a valid palindrome? "+isValidPalindromeWithRemoval(str));
    }

    private static boolean isValidPalindromeWithRemoval(String str) {
        
//        int start = 0; 
//        int end = str.length()-1;
//        int count = 0;
//        boolean result = true; 
//        while(count < 2 && start <= end){
//            if(str.charAt(start++) == str.charAt(end--)){
//                continue;
//            }else{
//                System.out.println("In here");
//                count++;
//            }
//        }
//        if(count > 1) result = false;
//        return result;

        for(int i=0; i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                int j = str.length()-1-i;
                return ispalindrome(str, i+1, j) || ispalindrome(str, i, j-1);
            }
        }  
        return true;
    }

    private static boolean ispalindrome(String str, int i, int j) {
        
        for(int k=i; k<i+(j-i)/2; k++){
            if(str.charAt(k) != str.charAt(j-k+i)) return false;
        }
        return true;
        
    }
    
    
}
