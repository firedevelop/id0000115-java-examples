import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_14 {
    public static void main(String[]args) {
        int num;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        System.out.println("Intro number: ");
        num=sc.nextInt();
            for(int j=0; j<=num; j++){
            for(int i=j; i<=num; i++){
                System.out.print("* ");
            }
            System.out.println("\n");
          }
        }
    }
