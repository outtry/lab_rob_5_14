package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String [] names = new String[2];
        int d = 1;
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть ім'я " + d +  " : ");
            d++;
            names[i] = sc.nextLine();
        }
        System.out.println(names[0].equalsIgnoreCase(names[1]));
    }
}