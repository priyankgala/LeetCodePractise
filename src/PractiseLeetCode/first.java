/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

/**
 *
 * @author Priyank
 */
import java.util.*;

public class first {
    public static void main(String[] args)
    {
        String n = "303";
        
        for(int i=0; i<n.length();i++){
            for(int j=i+1; j<=n.length();j++){
                String num = n.substring(i, j);
                System.out.println(num);
            }
        }
    }
    
}
