import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_05 {
    public static void main(String[]args){
        double num;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro num");
        num=sc.nextDouble();
        if(num<1 && num>-1 && num!=0){
            System.out.println("Number is almost zero");
        }else{
            System.out.println("Number is NOT almost zero");
        }


    }
}