package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05_04_Array_delete_index_position {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int t[] = {23,8,1,-3,17,5,99};

        int numElem = t.length;
        System.out.println(Arrays.toString(t));
        System.out.println("indice del elemento a borrar:");
        int indiceBorrar = sc.nextInt();
        while(indiceBorrar >= 0 && numElem !=0){
            if(indiceBorrar < numElem){
                t[indiceBorrar] = t[numElem - 1];
                numElem--;
                mostrarTabla(t, numElem);
            }else {
                System.out.println("No existe elemento a borrar");
            }
            System.out.println("Indice del elemento a borrar:");
            indiceBorrar = sc.nextInt();
        }
    }
    static void mostrarTabla(int a[],int n){
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+ ", ");
        }
        System.out.print("]");
    }
}