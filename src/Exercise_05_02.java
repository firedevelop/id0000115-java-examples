import java.util.Locale;
import java.util.Scanner;

public class Exercise_05_02 {
    public static void main(String[]args){
        int arraySize;

        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        System.out.println("Array Size:");
        arraySize = scan.nextInt();
        int[] numbers = new int[arraySize];
        for(int i=0; i<arraySize; i++){
            System.out.println("Intro num "+ i + ": ");
            numbers[i]=scan.nextInt();

        }

        for(int i=numbers.length-1; i>-1;i--){
            System.out.println(numbers[i]);
        }
    }
}