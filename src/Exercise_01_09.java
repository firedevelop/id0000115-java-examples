import java.util.Locale;
import java.util.Scanner;

public class Exercise_01_09 {
    public static void main(String[]args){
        double quarterApple1, quarterApple2, quarterApple3,quarterPear1,quarterPear2,quarterPear3,total,kiloApple,kiloPear;

        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        System.out.print("Intro price Kilo Apple: ");
        kiloApple = sc.nextDouble();
        System.out.print("Intro price Kilo Pear: ");
        kiloPear = sc.nextDouble();

        System.out.print("Intro quarterApple 1: ");
        quarterApple1 = sc.nextDouble();
        System.out.print("Intro quarterApple 2: ");
        quarterApple2 = sc.nextDouble();
        System.out.print("Intro quarterApple 3: ");
        quarterApple3 = sc.nextDouble();

        System.out.print("Intro quarterPear 1: ");
        quarterPear1 = sc.nextDouble();
        System.out.print("Intro quarterPear 2: ");
        quarterPear2 = sc.nextDouble();
        System.out.print("Intro quarterPear 3: ");
        quarterPear3 = sc.nextDouble();

         total = ((quarterApple1+quarterApple2+quarterApple3)*kiloApple) +((quarterPear1+quarterPear2+quarterPear3)*kiloPear);
         System.out.print("total is : " + total);


    }
}
