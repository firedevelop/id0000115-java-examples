package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_01 {
   public static void main(String[]args){
        int num;
        String pairOrOdd = "impar",positiveOrNegative = "positive";
       Scanner sc = new Scanner(System.in);
       sc = sc.useLocale(Locale.US);
       System.out.print("Intro num: ");
       num = sc.nextInt();
       while(num!=0) {
           if (num % 2 == 0) {
               pairOrOdd = "pair";
           }
           if (num < 0) {
               positiveOrNegative = "negative";
           }

           System.out.println("pair Or Odd=" + pairOrOdd + " \npositive Or Negative=" + positiveOrNegative + " \nMath.pow=" + Math.pow(num, 2));
           break;
       }
   }
}