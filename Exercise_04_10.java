package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_10 {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        System.out.println("Intro base: ");
        int num1 = scan.nextInt();
        System.out.println("Intro exponent: ");
        int num2 = scan.nextInt();
        if(num2>0) {
            friendNum(num1, num2);
        }else{
            System.out.println("Insert an expoent greather than zero");
        }
    }
    static void friendNum(int num1,int num2) {
       double total = Math.pow(num1,num2);
        System.out.println("Total:" + total);
    }

}