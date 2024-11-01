package BinarySearch.Revision;

public class ORBs {
    public static void main(String[] args){
        int [] arrays={1,2,3,4,5,6,7,8,9,10,11,12,33,44,55};
        int [] arr={9,8,7,6,5,4,3,2,1};
//     int target=33;
        int ans=orbs(arrays,666);
        System.out.println(ans);
    }
    static int orbs(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        if(arr.length==0){
            return -1;
        }
        boolean isAsc= arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
