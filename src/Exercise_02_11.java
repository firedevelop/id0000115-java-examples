import java.util.Locale;
import java.util.Scanner;

public class Exercise_02_11 {
    public static void main(String[]args){
        double note;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);
        note = sc.nextDouble();
        if(note<5){
            System.out.println("Insuficiente");
        }
        else if(note>=5 && note<6){
            System.out.println("Suficiente");
        }
        else if(note>6 && note<7){
            System.out.println("Good");
        }
        else if(note>=7 && note<9){
            System.out.println("notable");
        }
        else if(note>=9 && note<=10){
            System.out.println("sobresaliente");
        }else{
            System.out.println("input a number from 0 to 10");
        }
    }
}
