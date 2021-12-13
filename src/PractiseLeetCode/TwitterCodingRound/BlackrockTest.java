/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode.TwitterCodingRound;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 *
 * @author kinja
 */
public class BlackrockTest {
    
    private static int cartesianProduct(char[] A, char[] B, char[] x, int l1, int l2) {
    int num1 = Character.getNumericValue(x[0]);
    int num2 = Character.getNumericValue(x[1]);
//    System.out.println("Length 1: "+l1);
//    System.out.println("Length 2:"+l2);
//    System.out.println("Number 1: "+num1);
//    System.out.println("Number 2: "+num2);
    if(l1 > num1 && l2 >  num2) {
        if(Character.isDigit(A[num1]) && Character.isDigit(A[num2])) {
          return ((num1*l2)+num2);
        }
        else {
          return -1;
        }  
    }
    else {
      return -1;
    }
  }
    
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    
   //Reading First Line
   line = in.readLine();
//   line = line.replaceAll("[,]","").replaceAll("\\[","").replaceAll("\\]","").replaceAll("'","");
    line = line.replaceAll("[,\\[\\]' ]",""); //.replaceAll("\\[","").replaceAll("\\]","").replaceAll("'","");
   char []A = line.toCharArray();
    //Reading Second Line
    line = in.readLine();
   line = line.replaceAll("[,]","").replaceAll("\\[","").replaceAll("\\]","").replaceAll("'","");
   char []B = line.toCharArray();
  
    //Reading Third Line
    line = in.readLine();
   line = line.replaceAll("[,\\[\\]' \\(\\)]","");
           //line.replaceAll(",","").replaceAll("\\(","").replaceAll("\\)","");
   System.out.println(line);
   char []x = line.toCharArray();
   
   
   for(char i: x){
       System.out.println("Array vlaue is: "+i);
   }
   
    System.out.println(cartesianProduct(A,B,x,A.length,B.length));
  }
}
