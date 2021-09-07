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

About the java file: The current Program performs Multiplication and Division operations.

User Input:
1. choice: User should enter either 3 or 4 depending on which operation the user wants to perform.
2. first_operand, second_operand: The operands on which the Multiplication/Division operation is to be performed.

Expected Program Output:
The correct result for Multiplication and Division operations

Eg:
Welcome to Multiplication/Division Calculator:
Choose your operation:
3. Multiplication
4. Division
Enter 3 for performing Multiplication
Enter 4 for performing Division
4
Enter first operand
5
Enter second operand
6
The result of the operation is:0.8333333
*/
package com.alexandermervar;

import java.util.Scanner;

public class DebugProgramTwo
{
    // Added "static void" to main class
    public static void main(String[] args)
    {
        float result=0;
        OperationsTwo obj = new OperationsTwo();
//        Initializing Scanner object
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Multiplication/Division Calculator:");
        System.out.println("Choose your operation:");
        System.out.println("3. Multiplication\n4. Division");
        System.out.println("Enter 3 for performing Multiplication");
        System.out.println("Enter 4 for performing Division");
//        Taking an int input using Scanner object
        int choice = sc.nextInt();
        System.out.println("Enter first operand");
        // Changed variable name for firstOperand and secondOperand to fit Java conventions
        // Added parentheses for the function nexInt()
        int firstOperand = sc.nextInt();
        System.out.println("Enter second operand");
        int secondOperand = sc.nextInt();
        if(choice == 3.0)
        {
            // Switched the multiply and divide function calls to correct selection
            result=obj.multiply(firstOperand,secondOperand);
        }
        else if(choice == 4)
        {
            result=obj.divide(firstOperand,secondOperand);
        }
        System.out.println("The result of the operation is:"+result);
    }
}
// Changed class name to fit Java conventions
class OperationsTwo
{
//    function to multiply 2 integers
    public static float multiply(int firstOperand,int secondOperand){
        // Cast each operand as a float
        return (float) firstOperand * (float)secondOperand;
    }
//    function to divide 2 integers
    // Cast each operand as a float
    public static float divide(int firstOperand,int secondOperand){ return (float) firstOperand / (float) secondOperand;
    }

}