package SortingAlgorithm.Question;
//https://leetcode.com/problems/missing-number/
//CyclicShort
//Amazon Question
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correctIndex=nums[i];
            if(nums[i]<nums.length && nums[i] !=nums[correctIndex]){
                swap(nums,i,correctIndex);
            }else{
                i++;
            }
        }

        for(int indx=0; indx<nums.length;indx++){
            if(nums[indx]!=nums[indx]){
                return indx;
            }
        }
        return nums.length;
    }
    static void swap(int[] arr, int frist, int second){
        int temp=arr[frist];
        arr[frist]=arr[second];
        arr[second]=temp;
    }
}