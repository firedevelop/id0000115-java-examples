package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Exercise_05_05 {
    public static void main(String[]args){
        int length=0;
        System.out.println("Insert Length password:");
        length = functionLength();
        System.out.println(length);
        int[] password = functionPassword(length);
        System.out.println(Arrays.toString(password));
        int[] userPassword=functionUserPassword(length);
        System.out.println("userPassword: " + Arrays.toString(userPassword));

        do{
            userPassword=functionUserPassword(length);
            System.out.println("do while: " + Arrays.toString(userPassword) );
        }while(!Arrays.equals(password,userPassword));
        //int[] comparePassword = functionComparePassword(password, userPassword,length);
        }

    static int functionLength(){
        int length=0;
        length = ThreadLocalRandom.current().nextInt(1,5+1);
        return length;
    }
    static int[] functionPassword(int length) {
        int[] password = new int[length];
        for (int i = 0; i < length; i++) {
            int generator = ThreadLocalRandom.current().nextInt(1, 5 + 1);
            password[i] = generator;
        }
        return password;
    }
    static int[] functionUserPassword(int length){
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        int[] userPassword = new int[length];
        for(int i=0; i<length;i++){
            System.out.println("Intro password (length):"+length + " userPassword["+i+"]");

            userPassword[i]=scan.nextInt();


        }
        return userPassword;
        }


}