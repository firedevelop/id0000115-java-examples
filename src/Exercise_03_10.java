import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_10 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        do{
        System.out.println("Intro number between 1 to 10: ");
        num = sc.nextInt();}
        while(num < 1 || num > 10);
            for (int i = 0; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }



    }
}