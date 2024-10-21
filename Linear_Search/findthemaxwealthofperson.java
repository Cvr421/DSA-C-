package Linear_Search;

public class findthemaxwealthofperson {
    public static void main(String[] args) {
     int[][]   accounts = {
             {1,5},
             {7,3},
             {3,5}
     };
     int ans=maximumWealth(accounts);
        System.out.println(ans);
    }
   static int maximumWealth(int[][] accounts) {
       int max= Integer.MIN_VALUE; // here we assinging the minimum value
//       person= row
//       account= col
       for(int person=0; person<accounts.length; person++){
           int sum=0;
           for(int account=0; account<accounts[person].length; account++){
               sum+=accounts[person][account]; // adding value
           }
           if(sum>max){
               max=sum; //comparing value
           }
       }
       return max;
    }
}
