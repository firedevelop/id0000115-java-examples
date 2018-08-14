import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05_06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int puntos[] = new int[8];

        for(int i=0; i<5;i++){
            System.out.println("Puntos programador(" + (i+1) + "):");
            puntos[i] = sc.nextInt();

            Arrays.sort(puntos,0,5);
            System.out.println(Arrays.toString(puntos));

            int numElem = 5;
            System.out.println("puntos de programador de exhibición: ");
            int puntosProgExh = sc.nextInt();
            while (puntosProgExh !=-1 && numElem < puntos.length){
                int pos = Arrays.binarySearch(puntos, 0 , numElem, puntosProgExh);
                int indiceInsercion ;
                if(pos < 0){
                    indiceInsercion = -pos -1;
                }else {
                    indiceInsercion = pos;
                }

                for(int j=numElem -1; j>=indiceInsercion; j--){
                    puntos[j + 1] = puntos[j];
                }

                puntos[indiceInsercion] = puntosProgExh;
                numElem++;
                if(numElem < puntos.length){
                    System.out.println("Puntos del programador de exhibición: ");
                    puntosProgExh = sc.nextInt();
                }
            }


            System.out.println("Puntuacion final:");
            System.out.println(Arrays.toString(puntos));
    }
}}
