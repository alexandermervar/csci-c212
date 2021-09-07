//  Lab 2
//
//  Released:  1/27/2021
//
//  @Author  Alexander Mervar amervar
//  Last Edited: 9.6.2021
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

About the java file: The current Program performs Square and Power operations.

User Input:
1. choice: User should enter either 5 or 6 depending on which operation the user wants to perform.
2. first_operand, second_operand: The operands on which the Square/Power operation is to be performed.

Expected Program Output:
The correct result for Square and Power operations

Eg:
Welcome to Square/Power Calculator:
Choose your operation:
5. Square
6. Power
Enter 5 for performing Square
Enter 6 for performing Power
5
Enter operand to be squared
4
The result of the operation is:
16
*/
package com.alexandermervar;

import java.util.Scanner;

public class DebugProgramThree {

    public static void main(String[] args) {
        // Added ;
        int result=0;
        // Changed class name to correct class name
        OperationsThree obj = new OperationsThree();
        // Changed to end quote to fix String
        System.out.println("Welcome to Square/Power Calculator:");
//      Initializing Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your operation:");
        // Changed text to display correct options
        System.out.println("5. Square\n6. Power");
        // Changed the ending to have an " as well as combined Strings as
        // concatenation was not necessary
        System.out.println("Enter 5 for performing Square");
        System.out.println("Enter 6 for performing Power");
//      Taking an int input using Scanner object
        int choice = sc.nextInt();
        if (choice==5){
            System.out.println("Enter operand to be squared");
            // Changed object name of Scanner class to sc
            // Changed variable name to fit Java conventions
            int firstOperand = sc.nextInt();
            result = obj.square(firstOperand);
        }
        // Changed statement to "else if"
        else if (choice==6){
            System.out.println("Enter the base");
            int firstOperand = sc.nextInt();
            System.out.println("Enter the power");
            int secondOperand = sc.nextInt();
            result=obj.power(firstOperand,secondOperand);
        }
        // Added space for clarity
        System.out.println("The result of the operation is: "+result);
    }
}

// Changed class name to OperationsThree to fit Java conventions
class OperationsThree{
//    function to perform square of an integer
    public static int square(int firstOperand){
        // Inserted ";" and added new line for clarity
        return firstOperand*firstOperand;
    }
//    function to calculate base integer raised to a power integer
    public static int power(int firstOperand, int secondOperand){

        // Added if statement for when secondOperand is == 0
        if (secondOperand == 0) {
            return 1;
        }
        int result = firstOperand;
        // Initialized the for loop at 1 because result it already equivalent to firstOperand
        // Changed order of for loop
        // Initialized "result"
        for(int i=1;i<secondOperand;i++){
            // Added return statement
            result *= firstOperand;
        }
        return result;
    }
}