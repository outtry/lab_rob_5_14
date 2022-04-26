package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int b = 1;
        float max = 0;
        float[] dob = new float[3];

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть " + b + " дробове число : ");
            b++;
            dob[i] = sc.nextFloat();
            if (dob[i] % 2 == 0) {
                System.out.println("Введено не вірне значення ! ");
                break;
            }else {
                max = Math.max(dob[0], Math.max(dob[1], dob[2]));
            }


        }
        System.out.println("Найбільше дробове число " + max);

    }
}