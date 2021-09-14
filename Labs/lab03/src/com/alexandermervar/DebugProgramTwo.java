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
2. base, height for triangle and radius for circle: The lengths of shapes for which areas must be computed.

Expected Program Output:
The correct result for this program

Eg: 

Find area of 
1 . Triangle 
2 . Circle 
Select a choice : 1
Enter the length of base : 
2
Enter the length of height : 
2
Area of triangle with length of sides 2 and 2 is : 2
*/
package com.alexandermervar;

import java.io.*;
// Added java.until.Scanner;
import java.util.Scanner;

class DebugProgramTwo
{
    // Added "private static void ..." to the function to make it only reachable by code within the class
    // Corrected method name to camel case
    private static void findArea(int a, int b)
    {
        // There was weird and inconsistent spacing (and lack thereof) in this function, so I fixed that
        double area = (a*b) / 2;
        // Cast area to into to match example above
        // Removed \n to match example above
        System.out.println( "Area of triangle with length of sides "+ a + " and " + b + " is : " + (int) area);
    }

    // Added "private static ..." to the function to make it only reachable by code within the class
    // Corrected method name to camel case
    private static void findArea(int a)
    {
        // Fixed math to be the correct area of a circle formula, which is pi * r^2
        // I added a closing )
        // Not sure if it's desired to leave pi as the 3.14 value or use the Math constant but, at the moment, I will leave it as is
        // Removed \n to match example above
        // Added space after ":"
        System.out.println( "Area of circle with  radius " + a + " is : " + 3.14 * (a*a));
    }
  // Added "static" and added whitespace (tabs) to all lines of code below
    public static void main(String p[]) throws IOException
    {
        // Removed object creation - Unnecessary
        // DebugProgramTwo d = new DebugProgramTwo();
        Scanner keyboard = new Scanner(System.in);
        // Removed extra \n
        System.out.print("\n Find area of \n 1 . Triangle \n 2 . Circle \nSelect a choice : ");
        int choice = keyboard.nextInt();

        // Changed the decision to look at instead the correct ints rather than the Strings they represent
        if(choice == 1) {
            // Removed \n to match example above
            // Added \n to match example above
            System.out.print("Enter the length of base : \n");
            // Properly initialized int x
            int x = keyboard.nextInt();
            // Removed \n to match example above
            // Added \n to match example above
            System.out.print("Enter the length of height : \n");
            // Properly initialized the int y
            // Added correct Scanner function
            int y = keyboard.nextInt();
            // Fixed call to findArea method
            findArea(x,y);
        
        }
        // changed to "else if" statement
        else if (choice == 2) {
            // Removed \n to match example above
            // Added \n to match example above
            System.out.print("Enter the radius : \n");
            int r = keyboard.nextInt();
            // Changed the call for the function to be correct and not use an object (that no longer exists)
            findArea(r);
        }
        else {
            System.out.println("Invalid choice");
        }
  
    }
}
// Removed "*/"