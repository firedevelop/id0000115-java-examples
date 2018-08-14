import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_09 {
    public static void main(String[]args){
        int num,tree1 = 0,tree2=0,firstBiggest = 0,biggest=0;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        System.out.println("Intro tree: ");
        do{
            num = sc.nextInt();
            if(biggest == 0) {
                if (firstBiggest > num) {
                    biggest = firstBiggest;
                }
                if (firstBiggest < num) {
                    biggest = num;
                }
            }
            if(biggest >0){
                if(num > biggest){
                    biggest = num;
                }

            }


        }while(num>0 || num>0);
        System.out.println("The biggest tree has: " + biggest);

    }
}