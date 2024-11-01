package BinarySearch;

public class Floor4 {
    public static void main(String[] args) {
        int [] arrays={2,3,5,9,14,16,18};
        int ans=floor(arrays,15);
        System.out.println(ans);
    }
    //floor no = largest element in the array which is smaller or = target element
    static int floor(int[] arr, int target){
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

        return end; // here for normal Binary search problem return -1 OR when the finding floor no return end
    }

}
