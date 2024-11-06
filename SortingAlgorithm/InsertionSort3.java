package SortingAlgorithm;

import java.util.Arrays;

public class InsertionSort3 {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Step 1: Iterate through each element in the array (starting from the second element)
//         - Start with the first unsorted element at index 1 (`i = 0` means only the first element is sorted by default).
//         - For each `i` from `0` to `arr.length - 2`, assume the elements up to `i` are sorted.

// Step 2: Insert each element into its correct position in the sorted part
//         - For each `i`, set `j` to `i + 1` (starting from the next element).
//         - Use an inner loop to compare `arr[j]` with elements to its left.
//         - While `arr[j]` is smaller than `arr[j-1]`, swap the two elements to shift `arr[j]` to the left.
//         - Continue until `arr[j]` is greater than or equal to the element on its left or `j` reaches the start of the array.

// Step 3: Stop when all elements have been sorted
//         - Repeat Steps 1 and 2 until `i` reaches `arr.length - 2`, meaning each element has been inserted into its correct position.
//         - The array will now be sorted in ascending order.

// Key Points:
// - Insertion sort works similarly to how you might sort cards in your hand by shifting elements into the correct position.
// - The time complexity of insertion sort is O(n²) in the worst case, but it performs well on small or nearly sorted datasets.
// - It is a stable, in-place sorting algorithm that doesn’t require additional memory, making it suitable for situations with limited memory.






    static void insertion(int[] arr){
        for(int i=0 ; i<arr.length-1;i++){ // it will go upto n-2
            for(int j=i+1;j>0; j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int tmp= arr[first];
        arr[first]=arr[second];
        arr[second]=tmp;


    }

}
