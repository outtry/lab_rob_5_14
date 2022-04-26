package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num = 1;
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ведіть слово " + num + " : ");
            num++;
            words[i] = sc.nextLine();
        }
        System.out.println(words[0] + " ".concat(words[1] + " ".concat(words[2] + " ".concat(words[3] + " ".concat(words[4])))));
    }
}