import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_12 {
    public static void main(String[]args){
        double num1,num2;
        int operation;
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        System.out.println("Insert the number option you want? \n 1 Add \n 2 Diff \n 3 Multiplication \n 4 Divide");
        operation = scan.nextInt();
        System.out.println("Intro num1: ");
        num1 = scan.nextDouble();
        System.out.println("Intro num2");
        num2 = scan.nextDouble();
        double total = calculator(num1,num2,operation);
        System.out.println(total);

    }
    static double calculator(double num1, double num2, int operation){
        double total = 0;
        if(operation==1){
            total = num1+num2;
        }if(operation == 2){
            total = num1-num2;
        }if(operation == 3){
            total = num1*num2;
        }if(operation == 4){
            total = num1/num2;
        }
        return (total);
    }

}
