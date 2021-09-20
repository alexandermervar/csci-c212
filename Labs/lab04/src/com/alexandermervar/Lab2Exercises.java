package com.alexandermervar;

import java.util.Random;
import java.util.Scanner;

public class Lab2Exercises {

    // Exercise 1 - secretNumber()
    public static void secretNumber() {
        Random ran = new Random();
        //Generates a number 0-10
        int number = ran.nextInt(11);
        System.out.println("Please input a integer 0-10 to guess a number 0-10: ");
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();
        int totalGuesses = 1;

        while(userGuess != number) {
            if (userGuess < number) {
                System.out.println("The number you gave is too small. Input a different guess: ");
                userGuess = sc.nextInt();
                totalGuesses++;
            }
            else if(userGuess > number) {
                System.out.println("The number you gave is too large. Input a different guess: ");
                userGuess = sc.nextInt();
                totalGuesses++;
            }
        }

        System.out.println("You have guessed correctly! In total, you guessed " + totalGuesses + " times.");
    }

    // Exercise 2 - exponentCalculator(int base, int exponent)
    public static int exponentCalculator(int base, int exponent) throws IllegalArgumentException {

        int returnNum = 1;

        if(exponent == 0) {
            return 1;
        }
        else if (exponent < 0) {
            // ERROR
            throw new IllegalArgumentException("Error: exponent can't be a negative number");
        }
        else {
            for(int i = 0; i < exponent; i++) {
                returnNum *= base;
            }
        }
        return returnNum;
    }
}
