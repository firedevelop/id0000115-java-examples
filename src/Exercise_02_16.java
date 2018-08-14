package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_16 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        //int num = sc.nextInt();
        int numberEnd=0;
        int num=93;
        String[] numName ={"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve","diez","once","doce","trece","catorce","quince"};
        if(num == 1){System.out.println(numName[num]);}
        else if(num == 2){System.out.println(numName[num]);}
        else if(num == 3){System.out.println(numName[num]);}
        else if(num == 4){System.out.println(numName[num]);}
        else if(num == 5){System.out.println(numName[num]);}
        else if(num == 6){System.out.println(numName[num]);}
        else if(num == 7){System.out.println(numName[num]);}
        else if(num == 8){System.out.println(numName[num]);}
        else if(num == 9){System.out.println(numName[num]);}
        else if(num == 10){System.out.println(numName[num]);}
        else if(num == 11){System.out.println(numName[num]);}
        else if(num == 12){System.out.println(numName[num]);}
        else if(num == 13){System.out.println(numName[num]);}
        else if(num == 14){System.out.println(numName[num]);}
        else if(num == 15){System.out.println(numName[num]);}
        else if(num > 15 && num<20){
            numberEnd = num%10;
                System.out.println("dieci"+numName[numberEnd]);
        }
        else if(num >= 21 && num <= 29){
            numberEnd = num%10;
            System.out.println("vein"+numName[numberEnd]);
        }
        else if(num >= 31 && num <= 39){
            numberEnd = num%10;
            System.out.println("treinta y "+numName[numberEnd]);
        }
        else if(num >= 41 && num <= 49){
            numberEnd = num%10;
            System.out.println("cuarenta y "+numName[numberEnd]);
        }
        else if(num >= 51 && num <= 59){
            numberEnd = num%10;
            System.out.println("cincuenta y "+numName[numberEnd]);
        }
        else if(num >= 61 && num <= 69){
            numberEnd = num%10;
            System.out.println("sesenta y "+numName[numberEnd]);
        }
        else if(num >= 71 && num <= 79){
            numberEnd = num%10;
            System.out.println("setenta y "+numName[numberEnd]);
        }
        else if(num >= 81 && num <= 89){
            numberEnd = num%10;
            System.out.println("ochenta y "+numName[numberEnd]);
        }
        else if(num >= 91 && num <= 99){
            numberEnd = num%10;
            System.out.println("noventa y "+numName[numberEnd]);
        }
        switch (num){
            case 20:
            System.out.println("veinte");
            case 30:
                System.out.println("treinta");
            case 40:
                System.out.println("cuarenta");
            case 50:
                System.out.println("cincuenta");
            case 60:
                System.out.println("sesenta");
            case 70:
                System.out.println("setenta");
            case 80:
                System.out.println("ochenta");
            case 90:
                System.out.println("noventa");

        }

    }
}