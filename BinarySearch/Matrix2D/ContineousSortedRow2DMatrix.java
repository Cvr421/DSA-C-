package BinarySearch.Matrix2D;

import java.util.Arrays;

public class ContineousSortedRow2DMatrix {
    public static void main(String[] args) {
        //  If only row-major sorting is present, the matrix is sorted more like a 1D array,
       //  and you can use binary search across the entire range if desired.
        int [][] matrix2={
                {1,  2, 3,  4},
                {5,  6, 7,  8},
                {9, 10, 11, 12},
                {13,14, 15, 16}
        };

        System.out.println(Arrays.toString( RowsortedMatrix(matrix2,6)));
//        int[] arr= new int[] {1,2,3};
    }

    //Applying simple BS on each single row
    // In the end Two row are remaining
    // |1|2|3|4|  // we are always on middle column then check on middle column if it is present or not
    // |5|6|7|8|  if not consider four parts 1 and 5 and 3,4 and 7,8 then implement BS on each part becoz it is in sorted
    // row = Every single row
    // Cstart and cEnd is boudarry of BS search space on each row
    static  int[] Binarysearch(int[][] matrix, int row, int cstart , int cEnd, int target){
        while(cstart<=cEnd){
            int mid= cstart+(cEnd-cstart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(target>matrix[row][mid]){
                cstart=mid+1;
            }else {
                cEnd=mid-1;
            }
        }
     return new int[]{-1,-1}; // int[] arr= new int {}
    }




    static int[] RowsortedMatrix(int [][] martrix, int target ){
        //Implement Binary Search.... On take the middle colomn OR Row  by  int mid= start+(end-start)/2;
        // if we take middle of column then reduce row OR if we take middle of row then reduce column
        //And implement BS on single middle one column....Reducing the search space
            // if element ==target then ans found
            // if element > target then ignore all rows after it . becoz we know that row is sorted in acending order so after this element all are going to be greater
            // if element < target then ignore all rows above it . becoz  we know that row is sorted in acending order so above this elemtn all are going to be smaller
        // In the end Two row are remaining
           // |1|2|3|4|  // we are always on middle column then check on middle column if it is present or not
           // |5|6|7|8|  if not consider four parts 1 and 5 and 3,4 and 7,8 then implement BS on each part becoz it is in sorted

      int row  =martrix.length; // this is no of rows
      int cols =martrix[0].length; // this is no fo cols ... // Be cautous , matrix may be empty

      if(row==1){
          return Binarysearch(martrix, 0, 0, cols-1,target);
      }

     // Now reducing he row
        int rStart=0;
      int  rEnd= row-1;
      int cMid= cols/2;

      // run the loop till 2 rows are remaining
        while(rStart<(rEnd-1)){ // while this is true it wiill have more than 2 row
            int mid= rStart+(rEnd-rStart)/2;
            if(martrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }
            if(target>martrix[mid][cMid]){
                rStart=mid;// ignoring above rows
            }else {
                rEnd=mid; // ignoring below rows
            }
        }



      //now we have two rows
        // check whether the target is in the middle col of 2 rows
        // In the end Two row are remaining
        // |1|2|3|4|  // we are always on middle column then check on middle column if it is present or not
        // |5|6|7|8|  if not consider four parts 1 and 5 and 3,4 and 7,8 then implement BS on each part becoz it is in sorted

        // Search in 1st half = 1
        //serach in 2nd half = 3,4
        //serach in 3nd half = 5
        //serach in 4nd half = 7,8

        // this is for middle column
        if(martrix[rStart][cMid]==target){ // checking for 2 value
            return new int[]{rStart,cMid};
        }
        if(martrix[rStart+1][cMid]==target){ // checking for 6 value
            return new int[]{rStart+1,cMid};
        }
//    if above two condition is not met


       // Search in 1st half
        if(target<=martrix[rStart][cMid-1]){
            return Binarysearch(martrix, rStart, 0, cMid-1,target);
        }
        //serach in 2nd half
        if(target>=martrix[rStart][cMid+1] && target<=martrix[rStart][cols-1]){
            return Binarysearch(martrix,rStart,cMid+1,cols-1,target);


        }
        // Search in 3rd half
        if(target<=martrix[rStart+1][cMid-1]){
            return Binarysearch(martrix , rStart+1, 0, cMid-1, target);
        }
        else {
            return Binarysearch(martrix, rStart+1, cMid+1, cols-1, target);
        }








    }


}
