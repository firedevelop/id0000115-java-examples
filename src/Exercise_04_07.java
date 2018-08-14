import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_07 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        System.out.println("Intro num: ");
        double num = scan.nextInt();
        miPrimo(num);
    }
    static void miPrimo(double num){
        boolean primo = true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                primo = false;

            }if(num%i !=0){
            }
        }
        if(primo == true) {
            System.out.println("THE NUMBER PRIME");
        }else
        {
            System.out.println("THE NUMBER IS NOT PRIME");}

    }


}