package Linear_Search;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindEvenNumberofDigit {
    public static void main(String[] args) {
       int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] numss) {
     int count=0;
     for(int num:numss){
         if(even(num)){
             count++;
         }
     }
     return  count;
    }
    // function to check whether  a number contains even digits or not
    static  boolean even(int num){
        int numberofdigit=digits(num);
//        if(numberofdigit%2==0){
//            return true;
//        }
        return numberofdigit % 2==0;
    }
//    step:1 Count the no of digit
    static int digits(int num){
        if(num<0){
            num=num*-1;

        }
        return (int)(Math.log10(num))+1;
//        if(num==0){
//            return 1;
//        }
//        int count=0;
//        while (num>0){
//            count++;
//            num=num/10;
//        }
//        return count;
    }
}
