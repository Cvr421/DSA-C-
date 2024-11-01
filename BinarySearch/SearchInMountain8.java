package BinarySearch;
//https://leetcode.com/problems/find-in-mountain-array/description/
public class SearchInMountain8 {
    public static void main(String[] args) {
       int[] array = {1,2,3,4,3,5,3,1};
       int ans=search(array,3);
        System.out.println(ans);
    }
    // Step 1: Find the peak element in the mountain array.
//         - Use a binary search approach to find the peak index where the array changes from increasing to decreasing.
//         - In the loop, compare mid with its next element to check whether we are in the ascending or descending part of the array.
//         - If arr[mid] > arr[mid + 1], we are in the descending part, so update end = mid (because mid could still be the peak).
//         - Otherwise, we are in the ascending part, so update start = mid + 1.
//         - When the loop ends, start will point to the peak element (largest value).

// Step 2: Perform binary search in the ascending part of the array (from 0 to peak).
//         - Use the peak index found in Step 1 as the endpoint for the first search.
//         - Apply an order-agnostic binary search (considering whether the array is ascending or descending).
//         - If the target is found, return the index of the target in the ascending part.

// Step 3: If the target is not found in the ascending part, perform binary search in the descending part of the array (from peak+1 to the end).
//         - Again, apply an order-agnostic binary search (this time considering the descending nature of this part).
//         - If the target is found, return the index. If not, return -1 to indicate the target is not present in the array.


// Key Points:
// - This approach splits the search into two parts: first in the increasing part of the array, and then in the decreasing part.
// - The time complexity remains O(log n) due to the two binary search steps.


    static int search(int[] arr, int target){
        int peak=peakIndexInMountainArray(arr);
        int firstTry=OrderagnosticBs(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        // try to Search in second half
        return OrderagnosticBs(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while (start< end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end=mid;
            }else{// (arr[mid]<arr[mid+1]
                // you are in asc part of array
                start=mid+1;
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;  // or return end as both are =
    }
    static int OrderagnosticBs(int[] arr, int target, int start, int end){

        if(arr.length==0) {
            return -1;
        }
        boolean isASC=arr[start]<arr[end];
        while (start<=end){
//            int mid= (start+end)/2; Here issue is when the limit of integer value exceed for large no while addition in jave
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return  mid;
            }
            if(isASC){
                if(target<arr[mid]){
                    end=mid-1;
                } else {
                    start = mid + 1;
                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;

                }
            }
        }
        return -1;
    }

}
