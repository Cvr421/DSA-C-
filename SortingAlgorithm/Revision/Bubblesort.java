package SortingAlgorithm.Revision;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args){
        int[] arr = {3,2,6,5,4};
        int[] arr2 = {1,2,3,4,5}; // if array is already sorted then why we need to traverse through whole arrray
        bubblesort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
    static  void bubblesort(int[] arr){
        boolean swaped;
        for(int i=0;i<arr.length; i++){
        swaped=false;
            for(int j=1; j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//                    swaped=true;
                }
            }

          if(!swaped){
              break;
          }

        }




    }
}
