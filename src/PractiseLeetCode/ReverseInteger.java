/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author kinja
 */
public class ReverseInteger {

    public static void main(String args[]) {
        int n = 1534236469;
        System.out.println(""+reverse(n));
    }

    static int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            x = x * -1;
            neg = true;
        }
        
        if (x == 0) {
            return 0;
        }
        
        int result = 0;
        int divide = 0;
         while (x > 0) {
            divide = x % 10;
            x = x / 10;    
            if(2147483647 > (result*10)){
                result = (result*10 + divide);
            }
            else
            {
                System.out.println("I am broken");
                break;
            }
            
            
        }
        
        if (neg) {
            return result * -1;
        } else if (result < Integer.MAX_VALUE) {
            return result;
        } else {
            return 0;
        }
    }

}
