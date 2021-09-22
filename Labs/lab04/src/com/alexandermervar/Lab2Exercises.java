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

        while(run) {
            System.out.println("Please select the pattern that you wish to create:");
            System.out.println("A. Arrow Pointing Left");
            System.out.println("B. Right Angle Triangle (Pointing Down and to the Left)");
            System.out.println("C. Hollow Square");
            System.out.println("D. Surprise Shape!");
            System.out.println("E. Exit");

            String user = sc.nextLine();
            Random ran = new Random();

            int size = ran.nextInt(8) + 3;

            // ERROR
            if((int) user.charAt(0) < 65 || user.charAt(0) > 69) {
                throw new IllegalArgumentException("Error: Invalid Menu Selection");
            }

            if(user.charAt(0) == 'A') {
                // Top Half
                int numStars = 1;
                for(int i=0; i < size; i++) {
                    //Spaces
                    for(int j = 0; j < size - numStars; j++) {
                        System.out.print(" ");
                    }
                    // Stars
                    for(int j = 0; j < numStars; j++) {
                        System.out.print("*");
                    }
                    numStars++;
                    System.out.println();
                }

                // Bottom Half
                numStars = size - 1;
                for(int i=1; i < size; i++) {
                    //Spaces
                    for(int j = 0; j < size - numStars; j++) {
                        System.out.print(" ");
                    }
                    // Stars
                    for(int j = 0; j < numStars; j++) {
                        System.out.print("*");
                    }
                    numStars--;
                    System.out.println();
                }
            }

            else if(user.charAt(0) == 'B') {
                String legend = String.valueOf(size);
                // System.out.println("Legend: " + legend);
                int lineLength = 1;

                // Height
                for(int i = 0; i < size; i++) {
                    for(int j = 0; j < lineLength; j++) {
                        if(j == lineLength - 1) {
                            System.out.println(legend);
                        }
                        else if(j%2==0){
                            System.out.print(legend);
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    lineLength += 2;
                }
            }

            else if(user.charAt(0) == 'C') {
                //System.out.println("Size: " + size);

                int lineLength = (size * 2) - 1;

                // Height
                for(int i = 0; i < size; i++) {
                    // Top Line
                    if (i == 0) {
                        for(int j = 0; j < lineLength; j++) {
                            if(j == lineLength - 1) {
                                System.out.println("*");
                            }
                            else if(j%2==0){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                    }
                    // Bottom Line
                    else if (i == size - 1) {
                        for(int j = 0; j < lineLength; j++) {
                            if(j == lineLength - 1) {
                                System.out.println("*");
                            }
                            else if(j%2==0){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                    }
                    // Middle
                    else {
                        for(int j = 0; j < lineLength; j++) {
                            if(j == lineLength - 1) {
                                System.out.println("*");
                            }
                            else if(j == 0){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }

            else if(user.charAt(0) == 'D') {
                int k = 0;
                for (int i = 1; i <= size; i++)
                {

                    for (int j = i; j < size; j++) {
                        System.out.print(" ");
                    }

                    while (k != (2 * i - 1)) {
                        if (k == 0 || k == 2 * i - 2)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                        k++;
                    }

                    k = 0;

                    System.out.println();
                }

                for (int i = size - 1; i >= 1; i--)
                {
                    for (int j = size; j > i; j--) {
                        System.out.print(" ");
                    }

                    System.out.print("*");

                    for(int j = 1; j < (i - 1) * 2; j++){
                        System.out.print(" ");
                    }

                    if (i == 1)
                    {
                        System.out.println();
                    }
                    else
                    {
                        System.out.println("*");
                    }
                }
            }

            else if(user.charAt(0) == 'E') {
                run = false;
            }
        }
    }
}
