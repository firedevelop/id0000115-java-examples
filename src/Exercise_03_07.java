public class Exercise_03_07 {
    public static void main(String[]args){
        int j=0;
        for(int i=0;i<20;i++){
            if(i%2!=0){
                 j++;
                System.out.println(i +" x "+ j + " = " + i*j);
            }
        }
    }
}