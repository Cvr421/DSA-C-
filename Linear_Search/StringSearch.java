package Linear_Search;

public class StringSearch {
    public static void main(String[] args) {
        String str="Chandravijay";
        char target= 'h';
        boolean ans=search2(str, target);
        System.out.println(ans);
    }

    // ForEach loop
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
       for(char ch: str.toCharArray()) {
           if(ch==target) {
               return true;
           }
       }

        return  false;
    }





    static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int index=0; index<str.length(); index++){
            if(str.charAt(index)==target){
                return true;
            }
        }
        return  false;
    }
}
