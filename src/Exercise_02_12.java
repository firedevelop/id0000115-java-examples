package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_12 {
   public static void main(String[]args){
       int day, month, year;
       Scanner sc = new Scanner(System.in);
       sc = sc.useLocale(Locale.US);
       System.out.print("Intro day: ");
       day = sc.nextInt();
       if(day < 1 || day > 32){
           System.out.println("Error: input number from 1 to 31");
       }
       System.out.print("Intro month: ");
       month = sc.nextInt();
       if(month < 1 || month > 12){
           System.out.println("Error: input number from 1 to 12");
       }
       if(month == 2){
           if(day == 29 || day == 30 || day == 31){
               System.out.println("Error: input right date.");
           }
       }
       if(month == 4 || month == 6 || month==8 || month==10 || month==12) {
           if(day == 31){
               System.out.println("Error: this month han't day " + day);
           }
       }

       System.out.println("Intro year: ");
       year = sc.nextInt();

       System.out.println("the date: " +day +" / "+month+ " / "+year + " are validate.");






   }
}
