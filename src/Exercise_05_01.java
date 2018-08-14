import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_01 {
    public static void main(String[] args) {
        double[] numbers = new double[5];
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Intro num" + i + ":");
            numbers[i] = scan.nextDouble();
        }
        for(int i=0; i< numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}