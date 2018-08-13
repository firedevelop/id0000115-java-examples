package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_10 {
   public static void main(String[]args) {
       int num, numLast, numFirst4Digits = 0, numFirst3Digits = 0, numFirst2Digits = 0;
       Scanner sc = new Scanner(System.in);
       sc = sc.useLocale(Locale.US);
       num = sc.nextInt();
       numLast = num % 10;
       if (num == 0 || num >= 10000) {
           System.out.println("Error: The number must be between 0 and 9999");
       }
       if (num <= 9999 && num >= 1000) {
           numFirst4Digits = num / 1000;
       }
       if (num <= 999 && num >= 100) {
           numFirst3Digits = num / 100;
       }
       if (num <= 99 && num >= 10) {
           numFirst2Digits = num / 10;
       }

       if(numFirst2Digits==numLast || numFirst3Digits==numLast || numFirst4Digits==numLast) {
           System.out.println("The num is capicua");
       }else{
           System.out.println("The number is NOT capicua");
       }

    }
}
