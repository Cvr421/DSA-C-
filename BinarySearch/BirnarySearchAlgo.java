package BinarySearch;
//https://leetcode.com/problems/binary-search/submissions/1429141066/
public class BirnarySearchAlgo {
    public static void main(String[] args) {
     int [] arrays={1,2,3,4,5,6,7,8,9,10,11,12,33,44,55};
//     int target=33;
     int ans=BinarySearch(arrays,10);
        System.out.println(ans);
    }
    static int BinarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        if(arr.length==0) {
            return -1;
        }
        if(start>end){
            return -1;
        }
        while (start<=end){
//            int mid= (start+end)/2; Here issue is when the limit of integer value exceed for large no while addition in jave
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;

            }else {
                return mid;
            }


        }
    return -1;
    }
}
