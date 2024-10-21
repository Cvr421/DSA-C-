package ArrayLIst_SimilarToVectorINCplus;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();

        //initialisation
        for(int i=0 ; i<3;i++){
            list.add(new ArrayList<>());// here we added the inter arraylint for every outer arraylist index ... like array int[][] aray= new int[3][3];
        }
        for(int i=0 ; i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt());
            }

        }
        System.out.println(list);

    }




}
