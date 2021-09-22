package com.alexandermervar;

import java.util.Scanner;

public class Lab04Main {

    public static void main(String[] args) {

        // Exercise 1
        // Call function secretNumber()

        Lab2Exercises.secretNumber();

        // Exercise 2
        // Call function exponentCalculator(int base, int exponent)
        System.out.println("Should be 9: " + Lab2Exercises.exponentCalculator(3, 2));
        System.out.println("Should be 16: " + Lab2Exercises.exponentCalculator(4, 2));
        System.out.println("Should be 3125: " + Lab2Exercises.exponentCalculator(5, 5));
        System.out.println("Should be 125: " + Lab2Exercises.exponentCalculator(5, 3));
        // System.out.println("Should be an Error: " + Lab2Exercises.exponentCalculator(5,-3));

        // Exercise 3
        // Call function patternMenu()
        Lab2Exercises.patternMenu();

    }
}
