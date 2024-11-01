package Linear_Search.Revision;

public class SearchInRange {
    public static void main(String[] args){
        int[] arrays={12,34,55,6,77,88,8,4};
        int target=77;
        System.out.println(sr(arrays,target, 0,3));
    }

    static int sr(int[] arr, int target, int sIndex , int eIndex){
        if(arr.length==0){
            return -1;
        }
        for(int i=sIndex; i<= eIndex; i++){
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
