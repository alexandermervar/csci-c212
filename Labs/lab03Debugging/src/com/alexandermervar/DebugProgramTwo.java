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
    private static void findarea(int a, int b)
    {
        // There was weird and inconsistent spacing (and lack thereof) in this function, so I fixed that
        double area = (a*b) / 2;
        System.out.println( "\n Area of triangle with length of sides "+ a + " and " + b + " is : "+ area);
    }

    // Added "private static ..." to the function to make it only reachable by code within the class
    private static void findarea(int a)
    {
        // Fixed math to be the correct area of a circle formula, which is pi * r^2
        // I added a closing )
        // Not sure if it's desired to leave pi as the 3.14 value or use the Math constant but, at the moment, I will leave it as is
        System.out.println( "\n Area of circle with  radius " + a + " is :" + 3.14 * (a*a));
    }
  // Added "static" and added whitespace (tabs) to all lines of code below
    public static void main(String p[]) throws IOException
    {
        DebugProgramTwo d = new DebugProgramTwo();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n Find area of \n 1 . Triangle \n 2 . Circle \n\nSelect a choice : ");
        int choice = keyboard.nextInt();

        if(choice == "Triangle") {
            System.out.print("\n Enter the length of base : ");
            intx =keyboard.nextInt();
            System.out.print("\n Enter the length of height : ");
            y=keyboard.next();
            staatic DebugProgramTwo.findarea(x,y);
        
        }
        else (choice == "Circle") {
            System.out.print("\n Enter the radius : ");
            int r =keyboard.nextInt();
            d.findarea(r);
        }
        else static {
            System.out.println("Invalid choice");
        }
  
    }
}
// Removed "*/"