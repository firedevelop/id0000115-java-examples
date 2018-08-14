import java.util.Scanner;

public class Exercise_03_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j, contadorPrimos = 0;
        boolean primo;

        System.out.print("Escriba n: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            primo = true;
            j=2;
            System.out.println("i vale antes " + i);
        while(j<=i-1 && primo == true){
            System.out.println("i vale " + i);
            if(i % j == 0){
                primo = false;
            }
            j++;
        }
        if(primo){
            contadorPrimos++;
            System.out.println(i + " es primo");
        }
    }
        System.out.println("De 1 a " + n + " hay " + contadorPrimos + " numeros primos");
}}