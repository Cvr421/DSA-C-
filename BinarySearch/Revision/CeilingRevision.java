package BinarySearch.Revision;

public class CeilingRevision {
    public static void main(String[] args) {
        int[] arrays={1,22,23,25,26,27,28,29};
        int ans =ceiling(arrays,24);
        System.out.println(ans);
    }
    static  int  ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        if(arr.length==0){
            return -1;
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;

            }else if(target<arr[mid]){
                end=mid-1;
            }else {
                return  mid;
            }
        }
        return start ; //ceiling
//        return end; //floor
    }
}
