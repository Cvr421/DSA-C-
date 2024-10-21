package Linear_Search;

public class FindMin {
    public static void main(String[] args) {
        int[] arrays={12,-2,55,6,-1,88,8,-1};
        int ans=minimum(arrays);
        System.out.println("Minimum from the array"+ " " +ans);
    }
    // find min item in range
    static int minimum2(int[] arr,int start, int end ){
        if(arr.length==0){
            return -1;
        }
        int min=arr[start];
        for(int i=start+1; i<=end; i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
    static int minimum(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
}
