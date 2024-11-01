package BinarySearch.Revision;

public class findthepeakelementinarray {
    public static void main(String[] args) {
        int[] arr={1,2,1,3,5,6,4}; // this array also clear why we putting end=mid not end =mid+1;
        int ans=peakelementindex((arr));
        System.out.println(ans);
    }
    static int peakelementindex(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // we are in the decresing part of the arry
                // so we know that peak element must be in left side of the array then end=mid
                end=mid;
            }else{ // arr[mid]<arr[mid+1]
                //Here we are in the asc order of the array
                // so we konw that are peak must be in right side of the array
                start=mid+1;

            }
            // At one point start and end is pointing to the same index and that is are max element
            // then  return start or end both are same piont
        }
        return start;
    }
}
