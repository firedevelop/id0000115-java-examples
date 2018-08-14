import java.util.Locale;
import java.util.Scanner;

public class Exercise_04_02 {
    public static void main(String[] args){
         int a=0,b=0,num1=0,num2=0;
         Scanner scan = new Scanner(System.in);
         scan= scan.useLocale(Locale.US);
         a = scan.nextInt();
         b = scan.nextInt();
        System.out.println("a="+a+ " b="+b);
         if (a <= b){
             num1 = a;
             num2 = b;
         }else{num1=b;num2=a;}
        System.out.println("num1="+num1+ " num2="+num2);
         showNumbers(num1,num2);
    }
    static void showNumbers(int num1,int num2){

            while(num1<num2){
                num1++;
                if(num1 !=num2) {
                    System.out.println(num1);
                }

    }

}}