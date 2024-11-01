package BinarySearch.Revision;

public class BS {
    public static void main(String[] args) {
        int [] arrays={1,2,3,4,5,6,7,8,9,11,12,33,44,55};
        int target=5;
        int ans=bs(arrays,target);
        System.out.println(ans);
    }
    static int bs(int[] arr, int target){
        int start=0;
        int end =arr.length-1;
        if (arr.length==0){
            return -1;
        }
        while (start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else {

                return mid;
            }

        }
        return -1;
    }
}
