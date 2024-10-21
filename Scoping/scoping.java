package Scoping;

public class scoping {
    public static void main(String[] args) {
        int a= 10;
        int b=11;

        {
//            int a=99;  this will not work read below
            a=55; // the ref variable which initialize already that can be modified but can't be reinialize with same ref variable
            int c= 555; // the value that is initialize in this block will remain in this block . it can not used outside of block

            System.out.println(c);




        }

int c= 666;
        System.out.println(c ); // this will print the above ref variable



    }
    static void  scopecheck(){
        int num = 63;
        System.out.println(num ); // this is accessable becoz it is present into the scopecheck func scope
//        System.out.println(a); // vaiable is not accessable into the scope func becoz it's out of scope present in main func
    }
}
