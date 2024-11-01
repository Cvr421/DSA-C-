package BinarySearch;
//Amazon question
//Q: Position of an Element in infiniter sorted array : On GeeksforGeeks
public class FindThePositionofTargetINInfiniteArray6 {
    public static void main(String[] args) {
       int[] arr={3,5,7,9,10,90,100,130,140,169,179};
       int target =10;
        System.out.println(ans(arr,target));
    }
// Step 1: Initialize two pointers 'start' and 'end' to define the search range.
//         - Initially, set start = 0 and end = 1 (since we are starting with a box of size 2).

// Step 2: Expand the search range exponentially until the target falls within the range:
//         - Use a while loop to check if the target is greater than the element at 'end'.
//         - Inside the loop, double the size of the range (box):
//             - New start = end + 1 (move start to end+1).
//             - Calculate new end using the formula end = end + (end - start + 1) * 2 to double the range size.
//         - Continue expanding until the target is within the range [start, end].

// Step 3: Once the target is within the range, apply binary search within the range [start, end].
//         - Use binary search logic to find the target in the array:
//             - Calculate mid = start + (end - start) / 2.
//             - If target < arr[mid], adjust the end pointer to search the left half (end = mid - 1).
//             - If target > arr[mid], adjust the start pointer to search the right half (start = mid + 1).
//             - If target == arr[mid], return the mid index.

// Step 4: If the target is not found, return -1 (indicating the target is not present in the array).

    static int ans(int[] arr, int target){
        //first find the range
        //first start with box of size 2
        int start=0;
        int end=1;
        //condition for the target to lie in the out of range
        while(target>arr[end]){
            int newstartforTemp= end+1;
            //double the box value
            //end= previous end + sizeofbox*2;
            //size of box formula = end-start+1
            end=end+(end-start+1)*2;
            start=newstartforTemp;
        }
        return BinarySearch(arr,target,start, end);
    }

    static int BinarySearch(int[] arr, int target,int start , int end){
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
