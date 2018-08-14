import java.util.Scanner;

public class Exercise_01_08 {
    public static void main(String[]args){
        double quarterApple1, quarterApple2, quarterApple3,quarterPear1,quarterPear2,quarterPear3,total,appleKilo,pearKilo;
        appleKilo = 2.35;
        pearKilo = 1.95;

        Scanner sc = new Scanner(System.in);
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

         total = ((quarterApple1+quarterApple2+quarterApple3)*appleKilo) +((quarterPear1+quarterPear2+quarterPear3)*pearKilo);
         System.out.print("total is : " + total);


    }
}
