import java.util.Scanner;

public class TypeConversionCasting {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // For typecasting the destination type is greater than the source type
        // Right(Source Type) > LeftSide(Destination Type)
        // Float bigger than integer
//        float num = input.nextFloat();
//       float num = input.nextInt(); // this will work
//     int num = input.nextFloat(); // this will not work
//        System.out.println(num);

        // TypeCasting  converting inter to float
//        int nums = (int) (66.65f);
//        System.out.println(nums);

//        automatic type promotion in expression
//         int a =257;
//         byte b = (byte)(a); // 257 % 257 =1 Here when ever the byte limit exceed .it will divide and get the rememder
//        System.out.println(b);

//        byte a= 40;
//        byte b= 50;
//        byte c= 100;
//        int d= a*b/c;
//        System.out.println(d);


//      byte b= 50;
//      b=b*2; here we can not divid the byte to integer . we have to explicity convert the integer to byte
//        System.out.println("नमस्ते");

        byte b= 42;
        char c= 'a';
        short s= 1024;
        int i = 50000;
        float f = 50000;
        double d = 0.1256;
        double result =(f * b) + (i / c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + "  " +(d * s));
        System.out.println(result);

       int number = 'a';
        System.out.println(number);


    }
}
