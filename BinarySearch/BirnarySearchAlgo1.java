package BinarySearch;
//https://leetcode.com/problems/binary-search/submissions/1429141066/
//when ever in the question... if array is shorted then use binary search
public class BirnarySearchAlgo1 {
    public static void main(String[] args) {
//     int [] arrays={1,2,3,4,5,6,7,8,9,11,12,33,44,55};
        int [] arrays={2,3,5,9,15,15,16,18};
     int ans=BinarySearch(arrays,15);
        System.out.println(ans);
    }
    // Time complexity is (LogN)
    // Step:1 Take two pointer (start) and (end) of the Array
    // Step:2 Find Middle index of the Array
    // Step:3 Compare the Target Value and Middle Value of the Array
    // Step:4 If Target is greater than middle value of array that sift the start pointer to (Mid+1) index of the array
    // Step:5 If Target is less then the middle value of the array then sift the End index to (Mid-1) index of the array
    // Step:6 Return mid ;
    static int BinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
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
}
