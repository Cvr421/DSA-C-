package Linear_Search.Revision;

import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18,12,3,9},
                {78, 99, 34, 56},
                {18,12}
        };

        int target =55;
        System.out.println(Arrays.toString(search2D(arr,target)));
        System.out.println(mx(arr));
    }

    static int[] search2D(int[][] arr,int target){
//        if(arr.length==0){
//            return new int[] {-1,-1};
//
//        }
        for(int row=0; row<=arr.length-1;row++){
            for(int col=0 ; col<=arr[row].length-1; col++){
              if(target==arr[row][col]){
                  return new int[]{row,col};
              }
            }
        }
        return new int[]{-1,-1};
    }

    // find the max value of array
    static int mx(int[][] arr){
        int Max= Integer.MIN_VALUE;

        for(int row=0; row<=arr.length-1;row++){
            for(int col=0 ; col<=arr[row].length-1; col++){
                if(Max<arr[row][col]){
                    Max=arr[row][col];
                }
            }
        }



        //        for(int[] row: arr){
//            for(int col: row){
//                if(Max< col){
//                    Max=col;
//                }
//            }
//        }
        return Max;
    }









}
