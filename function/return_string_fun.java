package function;

public class return_string_fun {
    public static void main(String[] args) {
      String message=  greet();
        System.out.println(message);
    }
    static String greet(){
        String greeting= "How are you??";
        return greeting ;
    }


/*
return_type function_name  (argument){
  body
  return
  }
 */

}
