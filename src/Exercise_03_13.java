import java.util.Locale;
import java.util.Scanner;

public class Exercise_03_13 {
    public static void main(String[]args){
        int alumno1 = 0,alumno2=0,alumno3=0,alumno4=0,alumno5=0,alumno6=0,count=1,countSuspense=0,Approved=6;
        Scanner sc = new Scanner(System.in);
        sc = sc.useLocale(Locale.US);

        do{


            if(count==1) {
                System.out.print("\nIntro note alumno 1: ");
                alumno1= sc.nextInt();
                System.out.println("alumno1= "+alumno1);
            }
            if(count == 2){
                System.out.print("\nIntro note alumno 2: ");
                alumno2= sc.nextInt();
                System.out.println("alumno2= "+alumno2);
            }
            if (count == 3){
                System.out.print("\nIntro note alumno 3: ");
                alumno3= sc.nextInt();
                System.out.println("alumno3= "+alumno3);
            }
            if (count == 4){
                System.out.print("\nIntro note alumno 4: ");
                alumno4= sc.nextInt();
                System.out.println("alumno4= "+alumno4);
            }
            if (count == 5){
                System.out.print("\nIntro note alumno 5: ");
                alumno5= sc.nextInt();
                System.out.println("alumno5= "+alumno5);
            }
            if (count == 6){
                System.out.print("\nIntro note alumno 6: ");
                alumno6= sc.nextInt();
                System.out.println("alumno6= "+alumno6);
            }count++;

        }while(count<=6);
        if (alumno1 < 5) {
            countSuspense++;
            }
        if (alumno2 < 5) {
            countSuspense++;
        }
        if (alumno3 < 5) {
            countSuspense++;
        }
        if (alumno4 < 5) {
            countSuspense++;
        }
        if (alumno5 < 5) {
            countSuspense++;
        }
        if (alumno6 < 5) {
            countSuspense++;
        }

        System.out.println("Total Suspenses: " + countSuspense);
        int TotalApproved=Approved-countSuspense;
        System.out.println("Total Approved: " +TotalApproved);
    }
}