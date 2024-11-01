package BinarySearch.Revision;

import java.util.Arrays;

public class FansLpositonElement {
    public static void main(String[] args) {
        int[]  nums = {5,7,7,7,8,8,10};
        int[] ans= search(nums, 0);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] search(int[] arr, int target){
        int[] ans={-1,-1};
        ans[0]=Bs(arr,target,true);
        if(ans[0]!= -1){
            ans[1]=Bs(arr,target,false);
        }
        return ans;
    }
    static int Bs(int[] arr, int target, boolean findfirstIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
//        if(arr.length==0){
//            return -1;
//
//        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else {
                ans=mid;
                if(findfirstIndex){ // this will always find in the left side of the array becoz first index always in left ... deu to array is shorted
                    end=mid-1;
                }else {// (!findfirstIndex) this will search in right side of the arrray bcoz last index always find in the right side of the array
                    start=mid+1;
                }
            }

        }
        return ans;
    }
}
