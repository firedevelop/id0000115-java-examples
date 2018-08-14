import java.util.Locale;
import java.util.Scanner;

public class Exercise_Proposed_01_07 {
    public static void main(String[]args){
    double milimeters,centimeters,meters,total;
    Scanner sc = new Scanner(System.in);
    sc = sc.useLocale(Locale.US);
    System.out.println("Intro milimeters: ");
    milimeters = sc.nextDouble();
    System.out.println("Intro centimeters: ");
    centimeters = sc.nextDouble();
    System.out.println("Intro meters: ");
    meters = sc.nextDouble();

    total = (milimeters/10)+(centimeters)+(meters*100);
    System.out.println("The total is: " + total + " centimeters");

    }
}
