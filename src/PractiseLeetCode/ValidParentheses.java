/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.util.Stack;

/**
 *
 * @author kinja
 */
public class ValidParentheses {

    public static void main(String args[]) {

        String s = "()";
        System.out.println("Output: "+isValid(s));
    }
    
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<Character>();
        char c = 'a';
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                myStack.push(s.charAt(i));
            } else {
                if(!myStack.isEmpty())
                    c = myStack.pop();
                else 
                    return false;
                if (s.charAt(i) == ')' && c == '(') {
                    continue;
                } else if (s.charAt(i) == '}' && c == '{') {
                    continue;
                } else if (s.charAt(i) == ']' && c == '[') {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if(myStack.isEmpty()){
            return true;    
        }
        else 
            return false;
        
    }

}
