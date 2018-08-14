package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_12 {
    public static void main(String[]args){
        int num = 0,num1 = 0,num2=0,num3=0,num4=0,num5=0, count=1;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        do{


            if(count==1) {
                System.out.println("Intro num 1: ");
                num1= sc.nextInt();
                System.out.println("num1="+num1);
            }
            if(count == 2){
                System.out.println("Intro num 2: ");
                num2= sc.nextInt();
                System.out.println("num2="+num2);
            }
            if (count == 3){
                System.out.println("Intro num 3: ");
                num3= sc.nextInt();
                System.out.println("num3="+num3);
            }
            if (count == 4){
                System.out.println("Intro num 4: ");
                num4= sc.nextInt();
                System.out.println("num4="+num4);
            }
            if (count == 5){
                System.out.println("Intro num 5: ");
                num5= sc.nextInt();
                System.out.println("num5="+num5);
            }count++;

        }while(count<=5);
        if (num1 < 5) {
            System.out.println("el num1" + "es: " + num1);
            }
        if (num2 < 5) {
            System.out.println("el num2" + "es: " + num2);
        }
        if (num3 < 5) {
            System.out.println("el num3" + "es: " + num3);
        }
        if (num4 < 5) {
            System.out.println("el num4" + "es: " + num4);
        }
        if (num5 < 5) {
            System.out.println("el num5" + "es: " + num5);
        }
    }
}