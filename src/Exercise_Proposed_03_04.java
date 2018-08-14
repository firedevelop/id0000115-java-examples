import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exercise_Proposed_03_04 {
    public static void main(String[] args) {
        int totalInt,e = 0,numberDiff,num;
        double total = 0;
        Scanner scan = new Scanner(System.in);
        scan = scan.useLocale(Locale.US);
        num = scan.nextInt();




            for (int i = 1; i <= num; i++) {
                total = Math.pow(i, 2);
                if(total <=num) {
                    totalInt=(int) total;

                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(totalInt);
                    Integer[] nums = list.toArray(new Integer[0]);
                    e = list.get(list.size() -1);

                    for(int j=0; j<nums.length; j++){
                        System.out.println(nums[j]);
                    }
                    
                }

        }
        numberDiff = num-e;
        System.out.println("Result " + e + " the module is: " + numberDiff);


    }
}