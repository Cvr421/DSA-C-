package Linear_Search.Revision;

public class SearchString {
    public static void main(String[] args) {
        String str="Chandravijay";
        char target= 'c';
        System.out.println(SS2(str, target));
    }

    static boolean SS2(String str, char target){
        if(str.length()==0){
            return  false;

        }
      for(char ch: str.toCharArray()){
          if(target==ch){
              return true;
          }
      }
        return false;
    }

    static boolean SS(String str, char target){
        if(str.length()==0){
            return  false;

        }
        for(int index=0; index<str.length(); index++){
            if(str.charAt(index)==target){
                return true;
            }
        }
        return false;
    }
}
