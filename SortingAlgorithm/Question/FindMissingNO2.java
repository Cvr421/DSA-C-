package SortingAlgorithm.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//Google Question
public class FindMissingNO2 {
//    public static void main(String[] args) {
//        int[] arr={4,3,2,7,8,2,3,1};
//        System.out.println(Arrays.toString(cyclicshort(arr)));
//    }

    public List<Integer> cyclicshort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!= arr[correctIndex]){
                swap(arr,i,correctIndex);
            }else{
                i++;
            }
        }
        // find the missing array... rest is cyclicsort
       List<Integer> ans=new ArrayList<>();
        for(int ind=0;ind<arr.length ;ind++){
            if(arr[ind]!=ind+1){
                ans.add(ind+1);
            }
        }

  return ans;
    }
    static void  swap(int[] arr, int first, int second) {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
