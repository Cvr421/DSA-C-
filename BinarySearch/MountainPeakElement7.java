package BinarySearch;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//https://leetcode.com/problems/find-peak-element/description/
public class MountainPeakElement7 {
    public static void main(String[] args){
  int[] arr={1,2,1,3,5,6,4}; // this array also clear why we putting end=mid not end =mid+1;
        int[] arra={1,2,3,4,3,5,3,1};
   int ans=peakIndexInMountainArray(arra);
        System.out.println(ans);
    }

    // Step 1: Initialize pointers for binary search.
//         - Set `start` to 0 and `end` to the last index of the array.
//         - This will allow us to search through the entire array for the peak.


// Step 2: Use a binary search approach to find the peak index.
//         - While `start` is less than `end`, calculate the midpoint `mid` as `start + (end - start) / 2`.
//         - Compare the middle element `arr[mid]` with its next element `arr[mid + 1]` to determine the direction of the search:
//           - If `arr[mid] > arr[mid + 1]`, we are in the descending part of the array, so the peak could be at `mid` or to the left. Update `end` to `mid` (not `mid - 1` to ensure `mid` is still considered).
//           - If `arr[mid] < arr[mid + 1]`, we are in the ascending part of the array, meaning the peak must be to the right. Update `start` to `mid + 1`.


// Step 3: When the loop ends, `start` will equal `end`, and both will point to the peak element.
//         - This is because the binary search narrows down to the point where only the peak remains, ensuring that it's the highest value in the given conditions of a mountain array.
//         - Return `start` (or `end`, as they are the same at this point) as the peak index.


// Key Points:
// - The algorithm efficiently finds the peak in O(log n) time complexity due to the binary search mechanism, making it suitable for large arrays.
// - The condition `end = mid` ensures that we do not skip potential peaks that might be at `mid`, allowing the search to cover all possibilities.








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
}
