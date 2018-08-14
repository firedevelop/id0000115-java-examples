package com.company;

import java.util.Calendar;

public class Exercise_Proposed_03_02 {
            public static void main(String[] args){
                Calendar calendario = Calendar.getInstance();
                System.out.println(calendario.getTime());
                calendario.add(Calendar.SECOND, 10);
                calendario.add(Calendar.MINUTE, 30);
                calendario.add(Calendar.HOUR, 1);
                System.out.println(calendario.getTime());

            }
        }