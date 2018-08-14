package com.company;

import java.util.Scanner;

public class Exercise_04_01 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Intro num: ");
        int num = scan.nextInt();
       eco(num);

        }


        static void eco(int num) {
             for (int i = 0; i < num; i++) {
                 System.out.println("Eco");
             }

         }
}