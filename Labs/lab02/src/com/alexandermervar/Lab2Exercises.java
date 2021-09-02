//  Lab 2
//
//  Released:  1/20/20
//
//  @Author  Alexander Mervar amervar
//  Last Edited: 9.2.2021
//
//
//  Directions:  Implement the following methods
//
//
//////////////////////////////////////////////////////////////////////////////////

// Note:  Do not need to explicitly import classes from java.lang but wanted to make it explicit
// Goal - understand using Static classes - i.e. the Math class was not designed to be Instantiated (make objects)
// It is a class that provides functionality and will be used to complete one of the methods

package com.alexandermervar;

import java.util.Scanner;
import java.util.Locale;

public class Lab2Exercises {

    // computes area of a trapezoid when given its upper side, lower side and height
    public static int areaOfATrapezoid(double a, double b, double h) {
        double area = ((a+b)/2)*h;
        return (int) area;
    }

    // computes perimeter of a trapezoid when given its sides
    public static int perimeterOfATrapezoid(double a, double b, double c, double d) {
        double perimeter = a + b + c + d;
        return (int) perimeter;
    }

    // Returns the count of character that is not vowels in the given String
    // Added on 8/31: I would suggest using built-in String methods (not a loop).
    // See a related note in lab instructions.
    public static int countNotVowels(String str) {
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                consonantCount++;
            }
        }
        return consonantCount;
    }

    /*
    // Use a Scanner to reads a number between 1000 and 1 Trillion and print it with commas (,) separating
    // every three digits. for example: 12317910.67 will be printed as $12,317,910.67
    // You MUST use divide and/or modulus operators and may save part of the number, then concatenate back
    // together as a String
    // You must use printf to print the combined string and everything else in this method.
    // Question: There is an easier way to print a number with commas (,) separating every 3 digits without
    // doing all the computations with %. What is it? Answer: Use printf .... How? write the code that will do it.
    public static String addCommas(double usrNumber) {


        // DecimalFormat formating = new DecimalFormat("#,###.00");
        // return formating.format(usrNumber);
    }
    */

    //NOTE: Completed the exercise within the main class using printf

    // test client
    public static void main(String[] args) {
      //TODO: Modify to test all methods from above.
      // Use Scanner to read inputs from user. Don't use Scanner inside above functions!
        // Exercise 1
        System.out.println("Should return 20: " + areaOfATrapezoid(4.0, 6.0, 4.0));

        // Exercise 2
        System.out.println("Should be 15: " + perimeterOfATrapezoid( 5.0, 4.0, 1.0, 5.0));

        // Exercise 3
        System.out.println("Should return 3: " + countNotVowels("Hello"));

        // Exercise 4
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number between 1,000 and 1,000,000,000,000: ");
        String userInput = input.nextLine();
        double userDouble = Double.parseDouble(userInput);
        // Was told input "$" as well as leave the decimal values that I have provided unchanged
        System.out.printf(Locale.US, "%,f %n", userDouble);
    }
}

////////////////////////////////////
//                                //
// ANSWER THE FOLLOWING QUESTIONS //
//                                //
////////////////////////////////////

/*
 * Questions 1-3 are on explicit and implicit casting of some numerical types
 *
 * 1.  What happens if you multiply an int with a char?
 *
 * It multiplies that integer by whatever value is numerically
 * assigned to the given char (Ex. 'A' = 65). This returns an integer
 * value.
 *
 * 2.  What happens if you multiply a double with a char?
 *
 * It multiplies that double by whatever value is numerically
 * assigned to the given char (Ex. 'A' = 65). This returns an double
 * value.
 *
 * 3.  What happens if you square a char?
 *
 * (I'm assuming that is referencing the Math.pow() function
 * that takes two doubles as arguments)
 *
 * It squares the value that is numerically assigned to the given
 * char (Ex. 'A' = 65). It casts the int value assigned
 * to the given char to a double in the process.
 * This returns a double.
 *
 * 4.  What happens if a method has a paramater of type int, but you pass it a char?
 *
 * You will get a compile time error. (Usally, the IDE will alert you
 * to this error.)
 *
 * 5.  What happens if a mehtod has a paramater of type char, but you pass it an int?
 *
 * You will get a compile time error. (Usally, the IDE will alert you
 * to this error.)
 *
 * 6.  What is the difference between two floating point primitive data types in the Java?
 *
 * Java has two floating point primitive data types doubles and floats. Doubles are able to store more data
 * because they are considerably larger in bits than floats.
 *
 * 7.  Consider the following code snippet.
 *     int i = 10;
 *     n = ++(i++);
 *     System.out.println(++(i++) % 5);
 *
 *     Without Compiling the Program:
 *     What {do you think} are the values of i and n if the code is executed?
 * This code will result in (multiple) errors so they won't have any values
 *     What are the final value printed?
 * N/A
 *     Now Compile and Run the Program to check your answers. If they are different, explain why
 *     and provide updated code!
 *
 * This code should instead be:
 *
 *     int i = 10;
 *     n = i++;
 *     n = n++;
 *     i = i++;
 *     i = i++;
 *     System.out.println(i % 5);
 *
 * 8.  If I define a class as below:
 *     class calc {
 *            public static int addOperation(int firstOperand, int sop){
 *                   return firstOperand+sop;
 *            }
 *            ...
 *     }
 *     Looking at Java Coding Conventions, what suggestions would you give for code refactoring?
 *
 *      The class name should be capitalized "class Calc" and
 *      change the argument name of the second argument to
 *      "secondOperand" to be more clear.
 *
 * 9.  int i = 10000000 * 100000000;
 *	   System.out.println(i);
 *
 *     Why does the code above print a weird answer? How will you fix it (for same computation)?
 *
 *     The multiplication of these two values exceeds the data allotment
 *     for an integer. Casting the value as a different data type (BigInteger)
 *     would resolve this error.
 */
