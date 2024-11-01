package BinarySearch;
// Ask In Google / Amazon
public class RotatedBS9 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(Findpivot(arr));
    }

    static int searchtarget(int[] nums, int target){
        int pivot=Findpivot(nums);
        // if you do not found the pivot . it means array is not rotated
        if(pivot==-1){
            // just do normal binary search
            return BinarySearch(nums,target,0,nums.length-1);
        }
        // if the pivot is found . you have found the two sorted array
        if(nums[pivot]== target){
            return  pivot;
        }
      if(target>=nums[0]){
          return BinarySearch(nums,target,0,nums[pivot-1]);
      }
      //target<start elment
      return BinarySearch(nums, target, pivot+1, nums.length-1);
    }



    static int BinarySearch(int[] arr, int target,int start, int end){

        while (start<=end){
//            int mid= (start+end)/2; Here issue is when the limit of integer value exceed for large no while addition in jave
            int mid= start+(end-start)/2;
            if(target<arr[mid]){ // not run when target=middle element in array
                end=mid-1;
            } else if (target>arr[mid]) { // not run when target=middle element in array
                start=mid+1;

            }else {
                return mid;
            }
        }
        //Ceiling no = Smallest element in the array which is greater or = target element
        return -1; // here for normal Binary search problem return -1 OR when the finding Ceiling no return start
    }

// This will not work in duplicate values into the array
    static int Findpivot(int[] arr){
        // pivot is always the greater element of the array
        int start=0;
        int end = arr.length-1;
        while(start<= end ){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{ // arr[mid]>=arr[start]
                start=mid+1;
            }
        }
        return -1;
    }

// For duplicate values
    static int Findpivotforduplicate(int[] arr){
        // pivot is always the greater element of the array
        int start=0;
        int end = arr.length-1;
        while(start<= end ){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
          // if elments at middle, start, end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skip the duplicates
                //NOTE: what if these elements at start and end were the pivot
                // check if start is pivot
                if(arr[start]> arr[start+1]){
                    return start;
                }
                start++;
                // check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end++;
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {

                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }




}
