package com.company;

import java.util.Arrays;

public class Exercise_05_06_IMPORTANT_binarySearch {
   public static void main(String[]args){
       char[] charArray={'i','o','a'};
       Arrays.sort(charArray);
       char charKey='i';
       System.out.println(charArray);
       System.out.println(charKey + " Found in " + Arrays.binarySearch(charArray,charKey));

   }
}
