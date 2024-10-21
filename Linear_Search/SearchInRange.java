package Linear_Search;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arrays={12,34,55,6,77,88,8,4};
        int target=34;
      int ans =search(arrays,target,1,4);
        System.out.println(ans);
    }


        static int search(int[] arr, int target, int start, int end){
            // if the size of the array is 0 then return -1
            if(arr.length==0){
                return  -1;
            }
            // finding item and returning index
            for(int index=start; index<=end; index++){
                if(arr[index]==target){
                    return index;
                }

            }
// if item not found in the array return -1;
            return -1;

        }

}
