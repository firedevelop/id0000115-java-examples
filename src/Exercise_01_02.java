package com.company;
import java.util.Scanner;
public class Exercise_01_02 {
    public static void main(String[]args){
        System.out.print("How old are you: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The next year you are: " + ++num + " years old");
    }
}
