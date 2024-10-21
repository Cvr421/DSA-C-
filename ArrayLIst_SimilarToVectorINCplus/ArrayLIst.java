package ArrayLIst_SimilarToVectorINCplus;

import java.util.ArrayList  ;
import java.util.Scanner;

public class ArrayLIst {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //Syntex
        // ArrayList is similar to vector in c++ ... here we not need to give the size of the array
        ArrayList<Integer> list= new ArrayList<>(5);

        // Adding items in list
//        list.add(56);
//        list.add(76);
//        list.add(6);
//        list.add(5);
//        list.add(66);
//        list.add(26);
//
//        System.out.println(list);
//      list.set(0,99);
//        System.out.println(list);
//        list.remove(3);
//        System.out.println(list);
        for(int i=0 ; i<5;i++){
            list.add(input.nextInt());
        }
//     geting item at every index
//        for(int i=0; i<5; i++){
//            System.out.println(list.get(i)); // pass the index here... list[insdex] like array will not work here
//        }
        System.out.println(list);
    }
}
