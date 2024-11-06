package SortingAlgorithm;

import java.util.Arrays;
// Selection sort take the max element from the array and then swap with the last index of array and this will contineou till the all item is sorted
//like second largest element is swap with second last index with array
//WC/BC=O(n^2)
//Stable Algorithm= no
//j will to upto <= n-i-1 no of comparesion
public class SelectionSort2 {
    public static void main(String[] args) {
      int[] arr={3,1,5,4,2};
      selection(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Step 1: Loop through the array to place each element in its correct position
//         - Initialize a loop `i` from `0` to `arr.length - 1`.
//         - For each `i`, the algorithm finds the maximum element in the unsorted part of the array and places it at the end of that part.

// Step 2: Find the maximum element in the remaining unsorted part of the array
//         - Define `lastIndex = arr.length - i - 1`, representing the last index of the unsorted part.
//         - Call the `getMaxIndex` function with the range `0` to `lastIndex` to find the index of the maximum element in that range.

// Step 3: Swap the maximum element with the element at `lastIndex`
//         - After finding `maxIndex`, swap the elements at `maxIndex` and `lastIndex` using the `swap` function.
//         - This places the largest element of the unsorted part in its final sorted position at `lastIndex`.

// Step 4: Repeat until the entire array is sorted
//         - Continue the process until all elements are sorted, with each pass moving the largest remaining element into its correct position.
//         - At the end, `i` will reach the second last element, meaning all elements are sorted.

// Key Points:
// - Selection sort repeatedly finds the maximum in the unsorted portion and moves it to its correct position.
// - The time complexity is O(n²) due to the nested loops, making it inefficient for large datasets.
// - This algorithm is not stable because equal elements might be swapped out of order.



    static void selection(int[] arr){
        for(int i=0; i<arr.length;i++){
            // find the max item in the remaining array and swap with correct index
            int lastIndex=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,lastIndex);
           swap(arr,maxIndex,lastIndex);

        }

    }
    static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getMaxIndex(int[] arr, int start , int end){
        int max=start;

        for(int i=start; i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }


        return max;

    }
}
