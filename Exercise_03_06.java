package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_06 {
   public static void main(String[]args) {
       int num1, num2,operation1,operation2;
       Scanner sc = new Scanner(System.in);
       sc = sc.useLocale(Locale.US);
       System.out.println("Intro num: ");
       num1 = 7;

       for(int i=1;i<100;i++){
       if(i%num1 == 0){
           System.out.println(i + " es multiplo de " + num1);
       }
}}}