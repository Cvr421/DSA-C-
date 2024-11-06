package SortingAlgorithm.Revision;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void selectionsort(int[] arr){
        for(int i=0;i<arr.length;i++){ // at every new value of i . we are decreasing the search space in array by cutting last index of arraay
            int lastindexarray=arr.length-i-1;
            int maxelementindex= maxindexofarray(arr,0, lastindexarray);
            swap(arr,maxelementindex,lastindexarray);
        }
    }

    static void swap(int[] arr, int first , int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }



    static int maxindexofarray(int[] arr ,int start ,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
       return max;
    }

}
