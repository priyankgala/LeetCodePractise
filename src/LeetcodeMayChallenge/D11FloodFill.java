/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetcodeMayChallenge;

/*

Leetcode 733: Easy
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image 
(from 0 to 65535).
Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill,
and a pixel value newColor, "flood fill" the image.
To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the 
starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those 
pixels (also with the same color as the starting pixel), and so on. 
Replace the color of all of the aforementioned pixels with the newColor.
At the end, return the modified image.

Example:
Input:
image = [[1,1,1];-->Row 1
         [1,1,0];
         [1,0,1]];

sr = 1, sc = 1, newColor = 2


Output: [[2,2,2];
         [2,2,0];
         [2,0,1]];


 */
public class D11FloodFill {

    public static void main(String args[]) {

        int[][] arr = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 2, sc = 1, newColor = 2;

        int[][] result = floodfill(arr, sr, sc, newColor);
        
        for(int i=0; i<arr.length;i++){
            for(int j =0; j<arr[0].length;j++){
                System.out.print(""+result[i][j]);
            }
            System.out.println("");
        }
    }

    private static int[][] floodfill(int[][] arr, int sr, int sc, int newColor) {
        if (arr[sr][sc] == newColor) {
            return arr;
        }
        fill(arr, sr, sc, arr[sr][sc], newColor);
        return arr;
    }

    private static void fill(int[][] arr, int sr, int sc, int par, int newColor) {
        
        if(sr<0 || sc < 0 || sr>=arr.length || sc >=arr[0].length || arr[sr][sc] != par)
            return;
        
        arr[sr][sc] = newColor;
        fill(arr, sr-1, sc, par, newColor);
        fill(arr, sr+1, sc, par, newColor);
        fill(arr, sr, sc-1, par, newColor);
        fill(arr, sr, sc+1, par, newColor);
    }

}
