package com.company;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int b = 1;
        String [] str = new String[5];
        for(int i = 0; i < 5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть " + b + " слово : ");
            b++;
            str[i] = sc.nextLine();
        }
        System.out.println(str[0].charAt(0) + " " + str[1].charAt(0) + " " + str[2].charAt(0) + " " + str[3].charAt(0) + " " + str[4].charAt(0));

    }
}