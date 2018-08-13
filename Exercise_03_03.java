package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_03 {
    public static void main(String[]args){
        int num=0,numRandom=0;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        numRandom= (int) Math.ceil(Math.random() * 100);
        System.out.println("(secret number: )" + numRandom);

        do {
            System.out.println("Intro num: ");
            num = sc.nextInt();
            if (num >= 0 && num <= 100) {
                if (num > numRandom) {
                    System.out.println("the number is lower");
                }
                if (num < numRandom) {
                    System.out.println("the number is higher");
                }
                if (num == numRandom) {
                    System.out.println("You win! the secret numer is: " + numRandom);
                }
                if(num==0){
                    System.out.println("Insert a number between 1 to 100");
                }
            }


        }
        while(num>=0);

            System.out.println("You lose");




    }
}