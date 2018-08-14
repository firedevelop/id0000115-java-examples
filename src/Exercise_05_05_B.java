import java.util.Arrays;

public class Exercise_05_05_B {
    public static void main(String[]args){
        int combSecreta[]=new int[2];
        generaCombinacion(combSecreta);
        System.out.println(Arrays.toString(combSecreta));
    }
    static void generaCombinacion(int t[]){
        final int MAX = 5;
        for(int i=0; i<t.length;i++){
            t[i]=(int)(Math.random()*MAX+1);
        }

    }

    }