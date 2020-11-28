/*
This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s) return their sum 
(also as a binary string).
Note: neither binary string will contain leading 0s unless the string itself is 0

Ex: Given the following binary strings...

"100" + "1", return "101"
"11" + "1", return "100"
"1" + "0", return  "1"
*/
public class D5AddBinary {
    public static void main(String args[]){
        String s1 = "1";
        String s2 = "1";
        
        System.out.println(addBinary(s1,s2));
                
    }

    private static String addBinary(String s1, String s2) {
        StringBuilder str = new StringBuilder();
        
        int sum = 0;
        int carry = 0;
        int m = s1.length()-1;
        int n = s2.length()-1;
                
        while(m >=0 || n>=0){
            sum =carry;
            if(m >= 0){
                sum += (s1.charAt(m--)- '0');
            }
            
            if(n >= 0){
                sum += (s2.charAt(n--)- '0');
            }
            
            str.append((sum%2));
            System.out.println(""+str.toString());
            carry = sum/2;
                
        }
        if(carry != 0)str.append(carry);
        
        return str.reverse().toString();
    }
}
