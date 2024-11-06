package SortingAlgorithm;

import java.util.Arrays;

// when given nos. from range 1,N in question => use cyclic sort {vvvvimp}
public class CyclicSort {
    public static void main(String[] args) {
  int [] arr={3,5,2,1,4};
   cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Step 1: Start at the first index
//         - Initialize a pointer `i` to the beginning of the array.
//         - While `i` is less than the length of the array, check if the element at `arr[i]` is in the correct position.

// Step 2: Calculate the correct index for each element
//         - For each `i`, calculate the `correctIndex` for `arr[i]` as `arr[i] - 1` (since the range is 1 to N).
//         - If `arr[i]` is already in the correct position, increment `i` and move to the next element.

// Step 3: Swap if the element is not in the correct position
//         - If `arr[i]` is not equal to `arr[correctIndex]`, swap `arr[i]` with `arr[correctIndex]`.
//         - After the swap, `arr[i]` might still need to be placed in its correct position, so do not increment `i`.

// Step 4: Repeat until all elements are in the correct positions
//         - Continue Steps 2 and 3 until all elements are in their correct positions (i.e., when `i` equals `arr.length`).

// Key Points:
// - Cyclic Sort is ideal when dealing with arrays where elements are within a specific range (e.g., 1 to N).
// - This algorithm sorts the array in O(n) time by placing each element in its correct index without additional memory.
// - The approach is efficient for problems like finding missing or duplicate numbers in an array.


    static void cyclicsort(int[] arr){
        int i=0;
        while (i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else {
                i++;
            }
        }
    }
    static void swap(int[] arr, int frist, int second){
        int temp=arr[frist];
        arr[frist]=arr[second];
        arr[second]=temp;
    }
}
