import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_02 {
    public static void main(String[]args){
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro num1: ");
        num1 = sc.nextInt();
        System.out.println("Intro num2: ");
        num2 = sc.nextInt();
        if(num1 == num2){
            System.out.println("The numbers are the same!");
        }else {
            System.out.println("The numbers are not the same");
        }

    }
}