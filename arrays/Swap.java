package arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,5,6,8,9};
        System.out.println(Arrays.toString(arr));
        reversearray(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void reversearray(int[] arr){
        int start=0;
        int end =arr.length-1;

        
  while (start<end){

            swap(arr,start,end);
            start++;
            end--;

        }





    }
    static  void swap(int[] arras ,int ind1, int ind2) {
       int temp= arras[ind1];
       arras[ind1]=arras[ind2];
       arras[ind2]=temp;
    }
}
