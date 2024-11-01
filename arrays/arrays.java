package arrays;

public class arrays {
    public static void main(String[] args) {
        //syntex
        // datatype[] variable_name=new datatype[size];
//        store 5 roll numbers;
//        int[] rnos=new int[5]
        int[] ros; // declaration of array. ros is getting defined in the stack memory
        ros=new int[5]; // initialisation : actually here object is being created in the heap memory
        // new : this key is used to create the new object

        String[] arr= new String[4];
        System.out.println(arr[0]);
    }
}
