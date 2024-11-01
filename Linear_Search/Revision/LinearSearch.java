package Linear_Search.Revision;

public class LinearSearch {
    public static void main(String[] args) {
//        Search the item in the array if found retrun index
        int[] arrays={12,34,55,6,77,88,8,4};
        int target=55;
        System.out.println(LS3(arrays,target));

    }
    static boolean LS3(int[] arr,int target){
        for(int Value:arr){
            if(target==Value){
                return true;
            }
        }
        return false;
    }


    static int LS2(int[] arr,int target){
        for(int Value:arr){
            if(target==Value){
                return Value;
            }
        }
        return Integer.MIN_VALUE;
    }



    static  int LS(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<arr.length-1; index++){
            if(target==arr[index]){
                return index;
            }
        }
        return -1;
    }

}
