package com.company;

import java.util.Scanner;

public class Exercise_01_05 {
    public static void main(String[]args){
    double note1, note2, note3;
    Scanner sc = new Scanner(System.in);
    System.out.print("Intro note 1: ");
    note1 = sc.nextDouble();
    System.out.print("Intro note 2: ");
    note2 = sc.nextDouble();
    System.out.print("Intro note 3: ");
    note3 = sc.nextDouble();

   double total = (note1 + note2 + note3)/3.0;

    int totalInteger = (int) total;
        System.out.print("The total integer is: " + totalInteger);
    }
}