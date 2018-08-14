package com.company;

import java.util.Locale;
import java.util.Scanner;


public class Exercise_01_10 {
    public static void main(String[] args) {
        double radious,length,area;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.print("Intro radious: ");
        radious = sc.nextDouble();
        length = (2*Math.PI)*radious;
        area = Math.PI * Math.pow(radious, 2);

        System.out.println("Length = " + Math.round(length));
    }
}
