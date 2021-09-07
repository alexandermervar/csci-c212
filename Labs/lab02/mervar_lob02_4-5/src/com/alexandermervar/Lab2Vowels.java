package com.alexandermervar;

public class Lab2Vowels {

    public static String replaceVowels(char[] givenCharArray, int stringLength) {
        // To complete this function:
        // 1. Process the given String to find the vowels within the String
        // 2. Convert the vowels to the correct ASCII integer values
        // 3. Convert the ASCII values to the opposite ASCII values
        // 4. Return the given String with the switched vowel values
        // 'a' = 97 'z' = 122 'A' = 65 'Z' = 90
        // 'e' = 101 'v' = 118 'E' = 69 'V' = 86
        int count = stringLength;
        char[] returnCharArray = givenCharArray;
        if (returnCharArray[count] == 'a' || returnCharArray[count] == 'e'
                || returnCharArray[count] == 'i' || returnCharArray[count] == 'o'
                || returnCharArray[count] == 'u' || returnCharArray[count] == 'A'
                || returnCharArray[count] == 'E' || returnCharArray[count] == 'I'
                || returnCharArray[count] == 'O' || returnCharArray[count] == 'U') {
            //Conversion Code & Recursive Statement
        }
        else {
            //Recursive Statement

        }

        /*
        if (returnString.contains("a") || returnString.contains("e") || returnString.contains("i")
                || returnString.contains("o") || returnString.contains("u")
            || returnString.contains("A") || returnString.contains("E") ||
                returnString.contains("I") || returnString.contains("O")
                || returnString.contains("U")) {

        }
        else {
            return returnString;
        }

         */
    }
}
