package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_03 {
    public static void main(String[]args){
        int num1,num2,numBigger;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("intro num1: ");
        num1 = sc.nextInt();
        System.out.println("intro num2: ");
        num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is bigger than " + num2);
        }
        if(num1<num2){
            System.out.println(num2 + " is bigger than " + num1);
        }
        else{
            System.out.println("the numbers are the same");
        }
    }
}