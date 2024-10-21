package Scoping;

public class Shadowing {
   static int x=90; // this will availble to the every where in this scope

    public static void main(String[] args) {
        System.out.println(x);
        int x;
//        System.out.println(x); showding is being when the value is inialized
                x= 41; // this is called the showding ... becoz it is showding the higher level x
        System.out.println(x); // this will print the x of this scope func
    func();
    }
    static void func(){
        System.out.println(x);
    }
}
