//  Lab 3
//
//  Released:  9/8/2021
//
//  @Author  Alexander Mervar amervar
//  Last Edited: 9.14.2021
//
//
//  Directions: The given file is not according to java coding guidelines
//              and may have compilation errors to be fixed. 
//              Tasks to be performed:
//              1. Edit the file to make it according to java coding guidelines 
//              and fix the errors if any.
//              2. Include comments to indicate the changes made to the file 
//              to make it according to coding conventions or fix issues.
//
//////////////////////////////////////////////////////////////////////////////

/*
Note: The file is a standalone java file, meaning you can run this file directly without having to set up the other 2 files.

About the java file: The current Program computes Area of different shapes based on user input.

User Input: 
1. choice: User should enter either 1 or 2 depending on which shape the user wants to compute area for.
2. first_operand, second_operand: The operands on which the addition/subtraction operation is to be performed.

Expected Program Output:
The correct result for Area operations

Eg: 
Find area of 
1 . Square
2 . Rectangle 
Select a choice : 2
Enter the breadth :
2
Enter the length :  
2
Area of rectangle with breadth 2 and length 2 is : 4
*/
package com.alexandermervar;

import java.io.*;
import java.util.Scanner;

class DebugProgramOne {
    // Added "private static ..." to the function to make it only reachable by code within the class
    private static void findarea(int a, int b) {
        // Removed \n to match example above
        System.out.println("Area of rectangle with breadth " + a + " and length " + b + " is : " + a * b);
    }

    // Added "private static ..." to the function to make it only reachable by code within the class
    private static void findarea(int a) {
        // Fixed math so that the correct output is given
        // Removed \n to match example above
        // Added space after : to match example above
        System.out.println("Area of square with  side " + a + " is : " + a * a);
    }

    public static void main(String p[]) throws IOException {
        // Removed the call to create a new Rectangle() object because it is unnecessary
        // DebugProgramOne d = new Rectangle();

        // Fixed the Scanner object to "(System.in)"
        Scanner keyboard = new Scanner(System.in);
        // Removed unnecessary \n element
        System.out.print("\n Find area of \n 1 . Square \n 2 . Rectangle \nSelect a choice : ");
        int choice = keyboard.nextInt();
        if(choice == 1) {
            // Removed \n to match example above
            // Added \n to match example above
            System.out.print("Enter the side : \n");
            int s = keyboard.nextInt();
            // object does not exist anymore and also doesn't need to be used to call the function
            findarea(s);
        }

        else if(choice == 2) {
            // Removed \n to match example above
            // Added \n to match example above
            System.out.print("Enter the breadth : \n");
            int a = keyboard.nextInt();
            // Removed \n to match example above
            // Added \n to match example above
            System.out.print("Enter the length : \n");
            // Changed type of length (b) to be an Int as specified in the arguments field of the defined function
            int b = keyboard.nextInt();
            findarea(a, b);
        }

        else{
            // Changed to System.out.println instead of just print()
            System.out.println("Invalid choice");
        }
    }
}