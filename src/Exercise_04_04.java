import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_04 {
    public static void main(String[]args){
        int num1,num2;
    Scanner scan = new Scanner(System.in);
    scan = scan.useLocale(Locale.US);
        System.out.println("Intro num1: ");
        num1 = scan.nextInt();
        System.out.println("Intro num2");
        num2 = scan.nextInt();

        calHigher(num1,num2);
    }
    static void calHigher(int num1, int num2){
        int higher=0;
        if(num1<num2){
            higher = num2;
        System.out.println("The higher numbr is: " + higher);}
        if(num1>num2){
            higher = num1;
            System.out.println("The higher numbr is: " + higher);
        }
        if(num1==num2){
            System.out.println("The numbers are equals");
        }

    }
}