package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_13 {
    public static void main(String[]args){
        int hour=11,minut=57,second=57,secondToIncrease=1;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Time: "+hour +":"+minut+":"+second);
        if(second == 59){
            if(minut == 59){
                if(hour == 23){
                    hour = 1;
                    minut =00;
                    second = 00;
                }if(hour !=23){
                    hour++;
                    minut =00;
                    second = 00;
                }
            }if(minut != 59 && minut !=00){
                minut++;
                second=00;
            }
        }
        if(second !=59 && second !=00){
            second++;
        }
        System.out.println("NEW Time: "+hour +":"+minut+":"+second);
    }
}
