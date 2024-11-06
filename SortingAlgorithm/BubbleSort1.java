package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
      int[] arr = {3,2,6,5,4,8};
        System.out.println(arr[1]);
        int[] arr2 = {1,2,3,4,5};
      bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }


    // Step 1: Initialize Variables // - Start with an integer array arr. // - Use a boolean variable swapped to track if any elements are swapped during an iteration of the outer loop, initializing it to false at the beginning of each outer loop pass.

// Step 2: Outer Loop for Iterations // - Loop n-1 times (where n is the length of arr), as after each pass, the largest unsorted element moves to the end. // - With each pass, the range of unsorted elements becomes smaller by one, so only the unsorted part of the array is processed.

// Step 3: Inner Loop for Swapping // - For each element in the unsorted portion (j = 1 to j = arr.length - i): // - Compare the current element arr[j] with the previous one arr[j - 1]. // - If arr[j] < arr[j - 1], swap them, and set swapped = true to indicate that sorting work is still needed in the next pass.

// Step 4: Check if Array is Sorted // - If no elements were swapped in the current outer loop iteration (swapped == false), it means the array is already sorted. Break out of the loop early to save time.

// Step 5: Output Sorted Array // - The array is now sorted in ascending order, with the smallest elements at the beginning and largest elements at the end.

//    Key Points:
//    The swapped check allows the algorithm to terminate early if the array is already sorted, improving efficiency in the best case to O(n).
//    The worst-case time complexity is O(n^2) if no early termination occurs (typical for arrays that are initially unsorted).



    static void bubblesort(int[] arr){
//        space complexcity is = o(1)
//          Time complexcity = BC o(N) WC o(n^2)
        // run the steps n-1 times
        boolean swaped ;

        for(int i=0; i<arr.length; i++){
            swaped=false;
          // for each step , max item will come at the last respective index
//            same ass   j<=arr.length-i-1;
            for(int j=1; j<arr.length-i; j++){
                // here j is going till the array is not sorted like 1,3,2,4,5 then it will run till 2 index becoz no sense to make traverce on sorted item ... time west
        // swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                 swaped = true;
                }


            }
            // if you did not swap for a particular value of i , it means the array is sorted hence stop the loop
            if(!swaped){
                break;
            }
        }

    }
}
