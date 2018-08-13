package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_15 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.print("Wenesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }
    }
}