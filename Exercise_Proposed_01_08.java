package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_Proposed_01_08 {
    public static void main(String[]args){
        int arm, spider, woodlice, total;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro number arms: ");
        arm = sc.nextInt();
        System.out.println("Intro number spiders: ");
        spider = sc.nextInt();
        System.out.println("Intro number woodlice");
        woodlice =sc.nextInt();

        total = (arm*4) + (spider*8) + (woodlice*14);
        System.out.println("The total legs are: " + total);
    }
}
