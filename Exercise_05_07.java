/*
package com.company;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise_05_07 {
    public static void main(String[] args){
        int length = 6;
        int[] total1 = functionArray1(length);
        int[] total2 = functionArray2(length);
        Arrays.sort(total1);
        System.out.println(Arrays.toString(total1));
        Arrays.sort(total2);
        System.out.println(Arrays.toString(total2));
        int[] numMin = functionNumMin(length);
    }

    static int[] functionArray1(int length) {
        int[] array1 = new int[length];
        for (int i = 0; i < length; i++) {
            int numRandom = functionNumRandom();
            array1[i] = numRandom;
        }
        return array1;
    }

    static int[] functionArray2(int length) {
        int[] array2 = new int[length];
        for (int i = 0; i < length; i++) {
            int numRandom = functionNumRandom();
            array2[i] = numRandom;
        }
        return array2;
    }

    static int functionNumRandom() {
        int numRandom = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
        return numRandom;
    }

    static void functionNumMin(int length){
        int[] array3=null;
       int[] array1 = functionArray1(length);
        int[] array2 = functionArray2(length);
        int lengthArray1Array2 = length*2;
        for(int i=0; i<lengthArray1Array2;i++){
            if(array1[i] < array2[i]){
                array3[i]=array1[i];
            }
        }




    }
}
*/