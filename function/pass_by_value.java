package function;

import java.util.Arrays;

public class pass_by_value {
    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
// In java there is no passed by refereced. its alwayss passed by value
    private static void change(int[] arr) {
        arr[0]=33;
    }
}
