/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRandFolder;

/**
 *
 * @author kinja
 */
public class Kangaroo {
    public static void main(String args[]){
        
        int x1 = 0, x2 = 4, v1 = 3, v2 = 2;
        
        System.out.println("Two kangaroos will intersect or not: "+kangaroo(x1, v1, x2, v2));
    }

    private static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v2> v1 && x2 > x1){
            return "NO";
        }
        
        
        return "No";
    }
    
}
