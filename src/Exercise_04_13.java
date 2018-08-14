package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_13 {
    public static void main(String[] args) {
        int num,total;
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        System.out.println("Intro num1: ");
        //num = scan.nextInt();
        num = 5;
        total = factorial(num);
        System.out.println("TOTAL: " + total);

    }

    static int factorial(int num) {
        int total=1;

        for(int i=1; i<=num; i++){
            total*=num;

            System.out.println("total="+total);
            num--;

        }
        return (total);

    }
}