package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_input {
    public static void main(String[]  args){
        Scanner in= new Scanner(System.in);
        // arry of primitive
//        int[] arr=new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=23;
//        arr[3]=45;
//        arr[4]=45;
//        // [23,45,23,45,45]
//        System.out.println(arr[3]);
     //input using for loops
//     for(int i=0;i<arr.length; i++){
//         arr[i]=in.nextInt();
//     }
//        System.out.println(Arrays.toString(arr));


//     for(int i=0;i<arr.length;i++){
//         System.out.println(arr[i]+" ");
//     }


        //  geting arr using for each element
//       for(int num:arr){
//           System.out.println(num + " "); // here num represents element of the array
//       }

//        System.out.println(arr[5]); index out of bound error

        // array of objects
        String[] str =new String[4];
        for (int i =0; i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));




    }
}
