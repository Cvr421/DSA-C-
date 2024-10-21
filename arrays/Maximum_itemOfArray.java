package arrays;

public class Maximum_itemOfArray {
    public static void main(String[] args) {
        int[] arr={1,5,6,8,9};


        System.out.println(maxInrange(arr,1,3));


    }
    static int max(int[] arr ){
        if(arr.length==0){
            return -1;
        }
        int mx=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]>mx){
               mx=arr[i]; // mx 5,6,8,9
            }
        }

     return  mx;
    }
    static int maxInrange(int[] arr , int start , int end){
        // work on edge cases here, like array being null
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }




        int mx=arr[start];
        for(int i=start; i<=end;i++){
            if(arr[i]>mx){
                mx=arr[i]; // mx 5,6,8,9
            }
        }

        return  mx;
    }



}
