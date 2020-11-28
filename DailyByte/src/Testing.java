
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinja
 */
public class Testing {
    
    public static void main(String args[]){
        
        String[] arr = {"abc", "pqr", "rst", "xyz", "abc"};
        
        Set<String> targetSet = new HashSet<String>(Arrays.asList(arr));
        
        for (String s: targetSet){
            System.out.println("Value is: "+s);
        }

        
    }
    
}
