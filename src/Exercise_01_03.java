package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Exercise_01_03 {
    public static void main(String[]args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Intro your birth year: ");
        int birth = sc.nextInt();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        age=year-birth;

        System.out.println("You are " + age + " old");



    }
}
