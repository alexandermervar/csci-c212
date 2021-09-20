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
        else if(exponent < 0) {
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

    public static void patternMenu() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);

        boolean run = true;

        while(run?) {
            System.out.println("Please select the pattern that you wish to create:");
            System.out.println("A. Arrow Pointing Left");
            System.out.println("B. Right Angle Triangle (Pointing Down and to the Left)");
            System.out.println("C. Hollow Square");
            System.out.println("D. Surprise Shape!");
            System.out.println("E. Exit");

            String user = sc.nextLine();
            Random ran = new Random();

            //TODO: Define size
            int size = ran.nextInt()

            // ERROR
            if(user != "A" || user != "B" || user != "C" || user != "D" || user != "E") {
                throw new IllegalArgumentException("Error: Invalid Menu Selection");
            }

            if(user == "A") {

            }

            else if(user == "B") {

            }

            else if(user == "C") {

            }

            else if(user == "D") {

            }

            else if(user == "E") {
                run = false;
            }
        }
    }
}
