import java.util.Locale;
import java.util.Scanner;

public class Exercise_Proposed_03_01 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            sc = sc.useLocale(Locale.US);
        System.out.println("Intro text: ");
            String text = sc.next();
            for(int i=0; i<text.length();i++){
                System.out.println(text.charAt(i));
            }

    }

}
