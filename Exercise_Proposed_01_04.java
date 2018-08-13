package com.company;

import java.util.Locale;
import java.util.Scanner;


public class Exercise_Proposed_01_04 {
    public static void main(String[]args){
        int area,base,altura;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro base: ");
        base = sc.nextInt();
        System.out.println("Intro altura");
        altura = sc.nextInt();
        area = (base*altura)/2;
        System.out.println("The area is: " + area);

    }
}
