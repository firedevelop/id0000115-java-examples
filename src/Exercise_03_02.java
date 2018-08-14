import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_02 {
    public static void main(String[]args){
        int age,total = 0,count=0,countAdult=0;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        do{
            System.out.println("Intro Age:");
            age = sc.nextInt();
            if(age>=0){
                total+=age;
                count++;
                if(age>=18){
                    countAdult++;
                }
            }

        }
        while (age>=0);
        System.out.println("Total Age=" + total + "\n" + "Total Avg=" + total/count + "\n" + "Total Adult=s"+countAdult);

   }
}