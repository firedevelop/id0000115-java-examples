package com.company;

import java.util.Locale;
import java.util.Scanner;


public class Exercise_Proposed_01_01 {
   public static void main(String[]args){
       double taxBase, IVAtoPay, total, IVAcalc, IVA;
       Scanner sc = new Scanner(System.in);
       sc = sc.useLocale(Locale.US);
       System.out.print("Intro TAX Base: ");
       taxBase=sc.nextDouble();
       System.out.println("Intro Typo TAX: 21, 10 or 4");
       IVA = sc.nextInt();
       IVAcalc = IVA/100;
       IVAtoPay = taxBase*(IVAcalc);
       total = taxBase + IVAtoPay;
       System.out.println("Total to pay: " + total + " Tax to pay: " + IVAcalc);







   }
}
