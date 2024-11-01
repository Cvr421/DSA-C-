package BinarySearch;

import java.util.Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/== facebook
public class FirstAndLastPositionofElement5 {
    public static void main(String[] args) {
      int[]  nums = {5,7,7,7,8,8,10};
      int[] ans= searchRange(nums, 7);
        System.out.println(Arrays.toString(ans));

    }
    // Step 1: Initialize an array 'ans' of size 2 to store the first and last positions. Initially, set both positions to -1.
// Step 2: Use binary search to find the first occurrence of the target element by calling 'search' with 'findstartindex' set to true.
// Step 3: Similarly, use binary search to find the last occurrence of the target element by calling 'search' with 'findstartindex' set to false.
// Step 4: In the 'search' function:
//     - Perform a regular binary search loop (while start <= end):
//         - Calculate the mid index as start + (end - start) / 2 to avoid overflow.
//         - If the target is smaller than nums[mid], update end to mid - 1 (search left).
//         - If the target is larger than nums[mid], update start to mid + 1 (search right).
//         - If the target is found, update 'ans' to mid (potential answer):
//             - If searching for the start index, continue searching to the left by updating end = mid - 1.
//             - If searching for the end index, continue searching to the right by updating start = mid + 1.
// Step 5: Return the 'ans' array containing the first and last positions of the target.

    static int[] searchRange(int[] nums, int target){

        int[] ans={-1,-1};
       // check for first occurence if target first value
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
//      int start= search(nums,target,true);
//      int end=search(nums,target,false);
//      ans[0]=start;
//      ans[1]=end;
      return ans;
    }


    // this function just returns the index value of target

static  int search(int[] nums, int target, boolean findstartindex){
   int ans =-1;
    int start=0;
    int end=nums.length-1;
    while (start<=end){
//            int mid= (start+end)/2; Here issue is when the limit of integer value exceed for large no while addition in jave
        int mid= start+(end-start)/2;
        if(target<nums[mid]){ // not run when target=middle element in array
            end=mid-1;
        } else if (target>nums[mid]) { // not run when target=middle element in array
            start=mid+1;

        }else {
            // potential ans found
         ans=mid;
         if(findstartindex){
             end=mid-1;
         }else {
             start=mid+1;
         }
        }
    }

    return ans;
}

}
