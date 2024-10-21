package function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Func_overloading {
    public static void main(String[] args) {
        // Func_overloading means when two function exit with same name but with different parameter/Argument is called overloadin
        func(2); // this will search which func function is taking the argument with integer value
        func(55); // same thing is here
        demo("kunal ","cvr","london");
    }

    // Two things need to be consider
    // 1 Type of argument should be different
    // if give same type of argument with with same no of argument this will give error... so here no of argument should be different
    static void  func(int a,int b){
        System.out.println(a);
    }
    static  void  func(int name){
        System.out.println(name);
    }

    static void demo(int ...var){
        System.out.println(Arrays.toString(var));
    }
    static void demo(String ...var){
        System.out.println(Arrays.toString(var));
    }


}


