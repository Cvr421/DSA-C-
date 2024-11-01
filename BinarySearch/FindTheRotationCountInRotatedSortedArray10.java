package BinarySearch;

public class FindTheRotationCountInRotatedSortedArray10 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotation(arr));
    }

    static int countRotation(int[] nums){
        int pivot=Findpivot(nums);
        return pivot+1;
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
