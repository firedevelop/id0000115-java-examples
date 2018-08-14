import java.util.Locale;
import java.util.Scanner;

public class Exercise_Proposed_03_03 {
            public static void main(String[]args){
                int num;
                Scanner sc = new Scanner(System.in);
                sc = sc.useLocale(Locale.US);
                System.out.println("Intro number: ");
                num= sc.nextInt();
                for(int i=0; i<num; i++){
                    System.out.println("Eco...");
                }
            }
        }