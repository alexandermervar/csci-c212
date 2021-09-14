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

About the java file: The current Program uses string built in functions like length(), charAt(), concat() and substring(). 

Expected Program Output:
The correct result for this program

Eg: 

*/

package com.alexandermervar;

import java.io.*;
import java.util.Scanner;

class DebugProgramThree {

    public static void main(String p[]) throws IOException {
        // Added Scanner because it is called above
        Scanner sc = new Scanner(System.in);
        System.out.println("Input String to work with: ");
        String str = sc.nextLine();
        // Added () for the end of the String courtesy function length()
        int len = str.length();

        // Corrected call to the length function as well as fixed the index that is being called
        // Changed variable name to be more descriptive
        char lastChar = str.charAt(str.length() - 1);
        System.out.println("The last character of the string is " + lastChar);

        String str1 = "Hello";
        String str2 = " World";

        // Removed static
        // Fixed call to the concat function and used proper variables
        System.out.println(str1.concat(str2));

        // Nothing is wrong here but I don't know if this is the intended output due to a lack of example above
        System.out.println(str.replace('i', 'K'));

        System.out.println("Substring starting from index 15:");
        System.out.println(str.substring(15));
        System.out.println("Substring starting from index 15 and ending at 20:");
        // Added proper end to the substring
        System.out.println(str.substring(15, 20));
    }
}