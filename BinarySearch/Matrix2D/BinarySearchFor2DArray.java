package BinarySearch.Matrix2D;

import java.util.Arrays;

public class BinarySearchFor2DArray {
    public static void main(String[] args) {
//        How to Identify a Sorted 2D Matrix
//        To determine if a matrix is sorted in both rows and columns (like matrix):
//        Check if each row is sorted in ascending order.
//        Check if each column is sorted in ascending order.
//
     int [][] matrix={
             {10,20,30,40},
             {15,25,35,45},
             {28,29,37,49},
             {33,34,38,50}
     };
//  If only row-major sorting is present, the matrix is sorted more like a 1D array,
//  and you can use binary search across the entire range if desired.
     int [][] matrix2={
             {1,2,3,4},
             {5,6,7,8},
             {9,10,11,12},
             {13,14,15,16}
     };
        System.out.println(Arrays.toString(BS2D(matrix2,10)));
    }


    static int[] BS2D(int[][] matrix, int target){
       int row=0;
       int col=matrix.length-1;
       while (row<matrix.length && col>=0){
           if(matrix[row][col]==target){
               return new int[]{row,col};
           }
           if(matrix[row][col]>target){
               col--;
           }else {
               row++;
           }
       }
return new int[]{-1,-1};
    }

}
