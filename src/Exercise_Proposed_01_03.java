import java.util.Locale;
import java.util.Scanner;


public class Exercise_Proposed_01_03 {
    public static void main(String[]args){
        int num1, multiplo,calc,modulo;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.print("Intro num: ");
        num1 = sc.nextInt();
        System.out.print("Intro multiplo: ");
        multiplo = sc.nextInt();
        modulo = (num1%multiplo);

        if(modulo == 0){
            calc = 0;
        }else{
            calc = multiplo-(num1%multiplo);
        }

        System.out.println("The number you need add is " + calc );

    }



}
