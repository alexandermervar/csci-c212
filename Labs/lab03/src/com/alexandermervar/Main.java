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

        //Space in Terminal
        System.out.println();

        // pigLatinDecoder
        System.out.println("Please input the Pig Latin String you wish to convert to English: ");
        String userPigInput = sc.nextLine();
        System.out.println("The translated String is: " + "\""
                + Lab3Exercises.pigLatinDecoder(userPigInput) + "\"");

        //Space in Terminal
        System.out.println();

        // randomCarsGenerator
        System.out.println("3 Random Cars: " + Lab3Exercises.randomCarsGenerator(3));
        System.out.println();
        System.out.println("5 Random Cars: " + Lab3Exercises.randomCarsGenerator(5));
        System.out.println();
        System.out.println("10 Random Cars: " + Lab3Exercises.randomCarsGenerator(10));

        //Space in Terminal
        System.out.println();

        // hexToIntNBin
        System.out.println("Hex Value 64: " + "\n" +
                Lab3Exercises.hexToIntNBin("64"));
        System.out.println("Hex Value 7DB7B: " + "\n" +
                Lab3Exercises.hexToIntNBin("7DB7B"));
        System.out.println("Hex Value 9DF73: " + "\n" +
                Lab3Exercises.hexToIntNBin("9DF73"));
        System.out.println("Hex Value 63: " + "\n" +
                Lab3Exercises.hexToIntNBin("63"));


    }
}
