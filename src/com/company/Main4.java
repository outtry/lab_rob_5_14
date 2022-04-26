package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        String [] str = new String[2];
        int c = 1;
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Ведіть слово " + c + " : ");
            c++;
            str[i] = sc.nextLine();

        }
        System.out.print("Довжина першого рядка " + str[0].length() + " || ");
        System.out.println("Довжина другого рядка " + str[1].length());
        c = Math.max(str[0].length(), str[1].length());
        if(str[0].length() > str[1].length()){
            System.out.println("Довший рядок №1! Кількість символів : " + c);
        }else System.out.println("Довший рядок №2! Кількість символів : " + c);
    }
}