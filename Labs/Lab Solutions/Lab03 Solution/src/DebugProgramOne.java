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

import java.util.Scanner;

/**
 * Note: Some differences are optional or can be accomplished a different way.
 * Differences:
 * - Removed Rectangle
 * - Renamed findarea to findArea
 * - Changed main(String p[]) to main(String[] args) and removes `throws`
 * - Changes print("Invalid choice") to System.out.println("Invalid choice")
 * - Changes DebugProgramOne d = new Rectangle() to Rectangle d = new Rectangle()
 * - Changes new Scanner(System.out) to new Scanner(System.in)
 * - Fixed additional space in findArea(int a) println
 * - Made findArea(int a) equation a * a
 * - Made both findArea's static
 * - Fixed general indentation and spacing. Removed useless \n chars from print statements
 * - Changed nextLong to nextInt
 */
class DebugProgramOne {
    private static void findArea(int a, int b) {
        System.out.println("Area of rectangle with breadth " + a + " and length " + b + " is : " + a * b);
    }

    private static void findArea(int a) {
        System.out.println("Area of square with side " + a + " is : " + a * a);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Find area of \n 1 . Square \n 2 . Rectangle \nSelect a choice : ");
        int choice = keyboard.nextInt();

        if (choice == 1) {
            System.out.print("Enter the side : ");
            int s = keyboard.nextInt();
            DebugProgramOne.findArea(s);
        } else if (choice == 2) {
            System.out.println("Enter the breadth : ");
            int a = keyboard.nextInt();
            System.out.println("Enter the length : ");
            int b = keyboard.nextInt();
            DebugProgramOne.findArea(a, b);
        } else {
            System.out.println("Invalid choice");
        }
    }
}