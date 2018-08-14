package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_04 {
    public static void main(String[]args){
        int num;

        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro num: ");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){

            System.out.println(" "+i);
        }

    }
}