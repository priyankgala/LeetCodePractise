/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiseLeetCode;

import java.io.File; 


public class FileRename {
    
    public static void main(String[] args) 
    { 
        int count = 81;
        //int newcount = 51;
        for(int i = 151; i<=190; i++, ++count)
        {
        File oldName = new File("C:\\Users\\Priyank\\Desktop\\Python_Project\\final\\brain\\X ray\\shoulder_"+i+".jpg"); 
        File newName = new File("C:\\Users\\Priyank\\Desktop\\Python_Project\\final\\brain\\X ray\\xray_"+count+".jpg"); 
  
        if (oldName.renameTo(newName))  
            System.out.println("Renamed successfully"+count );         
        else 
            System.out.println("Error");         
        }
    } 
    
}
