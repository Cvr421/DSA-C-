import java.util.Arrays;

public class VarlenghtArgument {
    public static void main(String[] args) {

        // Variable length argument store the multiple argument in function ... while passing as a parameter/ argum
     varArgs(1,2,3,4,5,6); // here is the multiple of argument we are passing like 1,2,3,4,5,6
        multipleVararg(1,3, "cvr", "lodon", "usa", "australia");
    }
    // variable length argument shoud always placed in end in funciton argument
    static void multipleVararg(int a, int b, String ...var){
        System.out.println(a+"  "+b);
        System.out.println(a+" "+  b +Arrays.toString(var));
    }
    static void  varArgs(int ...var){// ...var is variable length argument which store the integer argument... as many as we give in a array format
        System.out.println(Arrays.toString(var));

    }
}
