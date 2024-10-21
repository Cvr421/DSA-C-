package Linear_Search;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18,12,3,9},
                {78, 99, 34, 56},
                {18,12}
        };
        int target =34;
//        int[] ans=search(arr,target);// format of return value {row, col}
        System.out.println(Arrays.toString(search(arr,target)));
      int ans= max(arr);
        System.out.println(ans);
//
    }

    static int[] search(int[][] arr, int target){
//        if(arr.length==0){
//            return -1;
//        }
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(target==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for(int[] outerarr: arr){
            for(int innerarr:outerarr){
                if(max<innerarr){
                    max=innerarr;
                }
            }
        }
        return max;
    }
}
