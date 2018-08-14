import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_05 {
   public static void main(String[]args){
       int numMin,numMax,numRange;
       Scanner sc = new Scanner(System.in);
       sc = sc. useLocale(Locale.US);
       System.out.println("Intro number min: ");
       numMin = sc.nextInt();
       System.out.println("Intro number max:");
       numMax = sc.nextInt();
       do{

       System.out.println("Intro num in Range");
       numRange = sc.nextInt();

       }while (numRange < numMin || numRange > numMax);

           System.out.println("OK, the number " + numRange + " is in Range from " +numMin + " to " + numMax);

   }
}