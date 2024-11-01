package BinarySearch.Revision;

public class FindtheindexElementInfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,169,179};
        int target =10;
        System.out.println(Ans(arr,target));
    }

    static int Ans (int[] arr, int target ){
        //take the box size of 2
        int start=0;
        int end=1;

        while(target>arr[end]){
            int newstartIndex=end+1;
            //double the size of box
            // formula for doubling the size of box
            end=end+(end-start+1)*2;
            start=newstartIndex;

        }

        return Bs(arr, target, start, end);
    }

    static int Bs(int[] arr,int target,int start, int end){

        while (start<=end){

            int mid= start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;

            }else if(target<arr[mid]){
                end=mid-1;

            }else {
                return mid;
            }
        }
        return -1;
    }
}
