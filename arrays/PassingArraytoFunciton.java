package arrays;

import java.util.Arrays;

public class PassingArraytoFunciton {
    public static void main(String[] args) {
//        int[] num= new int[5];
        int[] nums={3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void change(int[] arr) { // arr array referring to the nums array internally
        arr[0]=99;
    }
}
