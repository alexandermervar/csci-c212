package com.alexandermervar;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pigLatinEncoder
        System.out.println("Please input the String you wish to convert to Pig Latin: ");
        String userEngInput = sc.nextLine();
        System.out.println("The translated String is: " + "\""
                + Lab3Exercises.pigLatinEncoder(userEngInput) + "\"");

    }
}
