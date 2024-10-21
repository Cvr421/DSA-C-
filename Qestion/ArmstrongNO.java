package Qestion;

import java.util.Scanner;

public class ArmstrongNO {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
//        int n=in.nextInt();
//        boolean ans=armstrongno(n);
//        System.out.println(ans);

        for(int i =0 ;i<1000;i++){
           if(armstrongno(i)){
               System.out.println(i);
           }
        }
    }
    static boolean armstrongno(int n){
        int original =n;
        int sum=0;
        while (n>0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;


        }
        return sum==original;
    }
}
