import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_08 {
    public static void main(String[]args){
        int factorial=1,num;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro num: ");
        num = sc.nextInt();
        for(int i=num;i>0;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}