package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9
         */
//        int[][] arr = new int[3][]; // Here no of row is important but col is not necessary
        Scanner input=new Scanner(System.in);

//        int[][] arr2D={
//                {1,2,3},//0th index
//                {4,5},// 1st index
//                {6,7,8,9}// 2nd index -> arr2D[2]->{6,7,8,9}
//        };
        int[][] arr= new int[3][3];
        System.out.println(arr.length); // this will give the lenght of Row .
       //input of arr2D
        for(int row=0; row<arr.length;row++){
            for(int col=0; col < arr[row].length; col++){
                arr[row][col]=input.nextInt();
            }
        }
       //output of array
//        for(int row=0; row < arr.length; row++){
//            for(int col=0; col < arr[row].length; col++){
//                System.out.print(arr[row][col]+" ");
//            }
//            System.out.println(" ");
//        }
     // output with tostring method
//        for(int row=0; row < arr.length; row++){
//            System.out.print(Arrays.toString(arr[row]));
//        }
//        Enhanced for loops
        for(int[] num: arr){
            System.out.println(Arrays.toString(num));
        }










    }
}
