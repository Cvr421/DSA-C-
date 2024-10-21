package function;

import java.util.Scanner;

public class Sum_funtion {
    public static void main(String[] args) {
       int ans= sum3(5,6);
        System.out.println(ans);
    }

//    passing the value as a parameter when we are calling the function
    static int sum3 (int a, int b){
        int  sumss = a+b;
        return sumss ;
    }



    // return method of function instead of void
    static  int sums(){
        Scanner input= new Scanner(System.in);
        int num1 ,num2, sum;
        System.out.println("Enter the value num1: ");
        num1=input.nextInt();
        System.out.println("Enter the value num2: ");
        num2=input.nextInt();
        sum=num1+num2;
//        System.out.println("The Entire value is : " + sum);
        return sum; // return means function over after return line no code will excute 
//        System.out.println("this will never excute !!!");
    }
   static void sum(){
        Scanner input= new Scanner(System.in);
        int num1 ,num2, sum;
        System.out.println("Enter the value num1: ");
        num1=input.nextInt();
        System.out.println("Enter the value num2: ");
        num2=input.nextInt();
        sum=num1+num2;
        System.out.println("The Entire value is : " + sum);
    }
}
