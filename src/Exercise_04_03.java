package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_03 {
    public static void main(String[]args){
        double radio,heigth;
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);

        System.out.println("insert radio");
        radio=scan.nextDouble();
        System.out.println("insert heigth");
        heigth = scan.nextDouble();
        calcVolume(radio,heigth);
    }
    static void calcVolume(double radio, double heigth){
        double volume = Math.PI*Math.pow(radio, 2)*heigth;
        System.out.println("Volume cilynder: " + volume);
    }
}