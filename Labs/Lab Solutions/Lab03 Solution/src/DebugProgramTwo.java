//  Lab 3
//
//  Released:  9/8/2021
//
//  @Author  Your Name and username
//  Last Edited: 1/27/2021
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

import java.util.Scanner;

/**
 * Note: Some differences are optional or can be accomplished a different way.
 * For example, Enter length of base can be on newline or on same line.
 * Differences:
 * - Made findarea to findArea and fixed function declaration. Uses doubles (can also use int instead if desired).
 * - Fixed circle findArea method to use pi * r^2. Uses Math.PI.
 * - Fixes main(String[] args) declaration.
 * - Removes DebugProgramTwo instantiation.
 * - Imports Scanner.
 * - Removes useless spaces and newline characters from print statements.
 * - Uses 1 and 2 for circle or triangle
 * - Removes useless block comment ending at end of file.
 * - Removes static keywords where they don't make any sense.
 * - Changed intx to int x.
 * - Changed next to nextInt and y to int y.
 * - Changes else to else if.
 * - Uses findArea as static instead of d.findarea.
 * - Changes x, y to base, height and r to radius.
 * -
 */
class DebugProgramTwo {
    private static void findArea(double a, double b) {
        double area = (a * b) / 2;
        System.out.println("Area of triangle with length of sides " + a + " and " + b + " is : " + area);
    }

    private static void findArea(int a) {
        System.out.println("Area of circle with radius " + a + " is : " + Math.PI * Math.pow(a, 2));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Find area of \n 1 . Triangle \n 2 . Circle \nSelect a choice : ");
        int choice = keyboard.nextInt();

        if (choice == 1) {
            System.out.println("Enter the length of base : ");
            int base = keyboard.nextInt();
            System.out.println("Enter the length of height : ");
            int height = keyboard.nextInt();
            DebugProgramTwo.findArea(base, height);
        } else if (choice == 2) {
            System.out.print("Enter the radius : ");
            int radius = keyboard.nextInt();
            DebugProgramTwo.findArea(radius);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
