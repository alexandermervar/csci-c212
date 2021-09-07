//  Lab 2
//
//  Released:  1/20/20
//
//  @Author  Alexander Mervar amervar
//  Last Edited: 9.7.2021
//
//
//  Directions:  Implement the following methods
//
//
//////////////////////////////////////////////////////////////////////////////////

package com.alexandermervar;

import java.util.Scanner;

public class ProblemFourAndFive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Lab2Integers");
        System.out.println("Please select the desired conversion:");
        System.out.println("1: char -> int ");
        System.out.println("2: int -> char ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Please input the char you wish to convert to an int: ");
            char selectedChar = sc.next().charAt(0);
            System.out.println("The given char is equivalent to: " + Lab2Integers.charToInt(selectedChar));
        }
        else if (choice == 2) {
            System.out.println("Please input the int you wish to convert to a char: ");
            int selectedInt = sc.nextInt();
            System.out.println("The given int is equivalent to: " + Lab2Integers.intToChar(selectedInt));
        }

        System.out.println("In the lab the following list of ints is provided for conversion:");
        System.out.println("65 90 88 97 99 117 121 39 36 38 43 125");
        System.out.println("Translation: "
                + Lab2Integers.intToChar(65)
                + Lab2Integers.intToChar(90)
                + Lab2Integers.intToChar(88)
                + Lab2Integers.intToChar(97)
                + Lab2Integers.intToChar(99)
                + Lab2Integers.intToChar(117)
                + Lab2Integers.intToChar(121)
                + Lab2Integers.intToChar(39)
                + Lab2Integers.intToChar(36)
                + Lab2Integers.intToChar(38)
                + Lab2Integers.intToChar(43)
                + Lab2Integers.intToChar(125));

        System.out.println("Should return ZZvVRllFf: " + Lab2Vowels.replaceVowels("AAeEIooUu"));
        System.out.println("Should return  Hvlll: " + Lab2Vowels.replaceVowels("Hello"));
        System.out.println("Should return  Zpplv: " + Lab2Vowels.replaceVowels("Apple"));
    }
}
