package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_08 {
    public static void main(String[]args){
        double a,b,c,coefficient1,coefficient2,power,raised;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro a:");
        a = sc.nextInt();
        System.out.println("Intro b:");
        b = -sc.nextInt();
        System.out.println("Intro c");
        c = sc.nextInt();

        power = Math.pow(b,2);
        raised = Math.sqrt(power-(4*a*c));
        coefficient1 = (b+raised)/(2*a);
        coefficient2 = (b-raised)/(2*a);
        System.out.println("b=" + b +"power="+ power + " raised=" + raised);
        System.out.println("coefficients="+ coefficient1 + " coefficient2=" + coefficient2);
    }
}