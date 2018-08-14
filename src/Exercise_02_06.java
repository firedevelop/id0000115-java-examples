package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Intro num2: ");
        double num2 = sc.nextDouble();
        System.out.println("Intro num3: ");
        double num3 = sc.nextDouble();
        double low=num3,middle=num3,high=num3;

        if(num1<num2 && num1<num3){ low = num1; }
        if(num1>num2 && num1>num3){ high = num1; }
        if(num1>num2 && num1<num3){ middle = num1;}

        if(num2<num1 && num2<num3){ low = num2; }
        if(num2>num1 && num2>num3){ high = num2; }
        if(num2>num1 && num2<num3){ middle = num2;}

        System.out.println("high="+high + " middle="+middle + " low="+low);





    }
}