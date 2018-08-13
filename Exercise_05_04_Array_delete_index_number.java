package com.company;// https://netjs.blogspot.com/2017/07/how-to-remove-elements-from-array-java.html
import java.util.Scanner;

    public class Exercise_05_04_Array_delete_index_number {
        public static void main(String[]args){
        int num;
        int[] array={1,2,5,12,7,3,8};
        int[] arrayNew=null;
        Scanner scan = new Scanner(System.in);
        System.out.println("Intro num from array to remove:");
        num = scan.nextInt();

        for(int i=0; i<array.length-1;i++){
            if(array[i]==num){
                arrayNew = new int[array.length-1];
                for(int index=0; index<i;index++){
                    arrayNew[index]=array[index];
                }
                for(int j=i;j<arrayNew.length;j++){
                    arrayNew[j]=array[j+1];
                }
            }
        }
        for(int i=0; i<arrayNew.length;i++){
            System.out.print(arrayNew[i]+",");
        }


    }
}