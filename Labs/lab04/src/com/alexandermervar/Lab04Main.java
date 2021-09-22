package com.alexandermervar;

public class Lab04Main {

    public static void main(String[] args) {

        // Exercise 1
        // Call function secretNumber()

        Lab4Exercises.secretNumber();

        // Exercise 2
        // Call function exponentCalculator(int base, int exponent)
        System.out.println("Should be 9: " + Lab4Exercises.exponentCalculator(3, 2));
        System.out.println("Should be 16: " + Lab4Exercises.exponentCalculator(4, 2));
        System.out.println("Should be 3125: " + Lab4Exercises.exponentCalculator(5, 5));
        System.out.println("Should be 125: " + Lab4Exercises.exponentCalculator(5, 3));
        // System.out.println("Should be an Error: " + Lab2Exercises.exponentCalculator(5,-3));

        // Exercise 3
        // Call function patternMenu()
        Lab4Exercises.patternMenu();

        // Exercise 4
        // Call function printMyBox(int h, int w)
        System.out.println(Lab4Exercises.printMyBox(3,4));
        System.out.println();
        System.out.println(Lab4Exercises.printMyBox(5,5));
        System.out.println();
        System.out.println(Lab4Exercises.printMyBox(3,3));
        System.out.println();
        System.out.println(Lab4Exercises.printMyBox(3,10));

    }
}
