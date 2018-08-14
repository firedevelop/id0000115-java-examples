import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_06 {
    public static void main(String[]args) {
        double num1;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.print("Intro num: ");
        num1 = sc.nextDouble();
        int total = (int) (num1+0.5);
        System.out.println("The number rounded is: " + total);


    }}

