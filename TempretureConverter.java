import java.util.Scanner;
//Fahrenheit to Celsius:\(C=(F-32)\times 5/9\)
//Celsius to Fahrenheit: \(F=C(9/5)+32\)
public class TempretureConverter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 0 for Celsius and 1 for Fehrenheit ");
        int C = input.nextInt();



        float Celsius;
        float Freh ;
        if(C == 0){
            System.out.println("Enter Frehenheit tem???");
            float temF =input.nextFloat();
            Celsius=(temF-32)*5/9;
            System.out.println("Celsius Tem" +" "+ Celsius);
        } else if (C == 1) {
            System.out.println("Enter Celcius tem???");
            float temCel = input.nextFloat();
           Freh = temCel*(9/5)+32;
            System.out.println("Fehrenheit Tem"+" "+ Freh);
        }else {
            System.out.println("Enter correct Number !!!");
        }


    }


}
