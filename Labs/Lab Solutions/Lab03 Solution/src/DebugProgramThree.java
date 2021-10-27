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

About the java file: The current Program uses string built in functions like length(), charAt(), concat() and substring(). 

Expected Program Output:
The correct result for this program

Eg: 
The last character of the string is e
Hello World
ThKs Ks a debuggKng exercKse
Substring starting from index 15:
ging exercise
Substring starting from index 15 and ending at 20 (inclusive):
ging e
*/

/**
 * Note: Some differences are optional or can be accomplished a different way.
 * Differences:
 * - Reformats indentation and newlines.
 * - Removes unused imports.
 * - uses str.length() and renames len to length.
 * - uses charAt(length - 1) to get last char.
 * - Renames ch1 to lastCharacter.
 * - Removes useless static keyword.
 * - str1.concat(str2) instead of String.concat(str1, str2).
 * - Changes 30 to 21, specifies if 20 is inclusive or exclusive.
 * - Removes throws and fixes main function declaration.
 */
class DebugProgramThree {
    public static void main(String[] args) {
        String str = "This is a debugging exercise";
        int length = str.length();

        char lastCharacter = str.charAt(length - 1);
        System.out.println("The last character of the string is " + lastCharacter);

        String str1 = "Hello";
        String str2 = " World";

        System.out.println(str1.concat(str2));
        System.out.println(str.replace('i', 'K'));

        System.out.println("Substring starting from index 15: ");
        System.out.println(str.substring(15));
        System.out.println("Substring starting from index 15 and ending at 20 (inclusive): ");
        System.out.println(str.substring(15, 21));
    }
}