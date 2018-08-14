package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_01 {
    public static void main(String[]main){
        int num,par,impar;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.print("Intro num: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("you insert a Even Number");
        }
        else{System.out.println("you insert a Odd Number");}

    }
}