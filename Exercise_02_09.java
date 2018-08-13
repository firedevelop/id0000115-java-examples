package com.company;

import java.util.Scanner;

public class Exercise_02_09 {
   public static void main(String[]args){
       int num,length;
       System.out.println("Intro num:");
       Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
       System.out.println("the number " + Integer.toString(num).length());
   }
}