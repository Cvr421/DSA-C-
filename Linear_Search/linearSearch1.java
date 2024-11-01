package Linear_Search;

public class linearSearch1 {
    public static void main(String[] args) {
    int[] arrays={12,34,55,6,77,88,8,4};
    int target=55;
    boolean ans =search3(arrays,target);
        System.out.println(ans);
    }
    // return boolean true or false

    static boolean search3(int[] arr, int target){
        // if the size of the array is 0 then return -1
        if(arr.length == 0){
            return false;
        }

        // finding item and returning
        for(int index : arr){
//            System.out.println("item of for Each loop"+ index);
            if(index==target){
                return true ;
            }

        }
// if item not found in the array return -1;
        return false;

    }




    // return item if found

    static int search2(int[] arr, int target){


        // finding item and returning index
        for(int index : arr){
            System.out.println("item of for Each loop"+ index);
            if(index==target){
                return index ;
            }

        }
// if item not found in the array return -1;
        return Integer.MAX_VALUE;

    }




   // search the item in the array if found return index
    // if item not found return -1
    static int search(int[] arr, int target){
        // if the size of the array is 0 then return -1
        if(arr.length==0){
            return  -1;
        }
       // finding item and returning index
        for(int index=0; index<arr.length; index++){
            if(arr[index]==target){
                return index;
            }

        }
// if item not found in the array return -1;
        return -1;

    }


}
