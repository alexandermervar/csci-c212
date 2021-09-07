//  Lab 2
//
//  Released:  1/20/20
//
//  @Author  Alexander Mervar amervar
//  Last Edited: 9.7.2021
//
//
//  Directions:  Implement the following methods
//
//
//////////////////////////////////////////////////////////////////////////////////

package com.alexandermervar;

public class Lab2Vowels {

    public static String replaceVowels(String beforeConvert) {
        // To complete this function:
        // 1. Process the given String to find the vowels within the String
        // 2. Convert the vowels to the correct ASCII integer values
        // 3. Convert the ASCII values to the opposite ASCII values
        // 4. Return the given String with the switched vowel values
        // 'a' = 97 'z' = 122 'A' = 65 'Z' = 90
        // 'e' = 101 'v' = 118 'E' = 69 'V' = 86
        if (beforeConvert.charAt(0) == 'a'
                || beforeConvert.charAt(0) == 'e'
                || beforeConvert.charAt(0) == 'i'
                || beforeConvert.charAt(0) == 'o'
                || beforeConvert.charAt(0) == 'u'
                || beforeConvert.charAt(0) == 'A'
                || beforeConvert.charAt(0) == 'E'
                || beforeConvert.charAt(0) == 'I'
                || beforeConvert.charAt(0) == 'O'
                || beforeConvert.charAt(0) == 'U') {
            if ((int) beforeConvert.charAt(0) <= 90) {
                int oldChar = (int) beforeConvert.charAt(0);
                int distance = oldChar - 65;
                if (beforeConvert.length() == 1){
                    return String.valueOf((char) (90 - distance));
                }
                else {
                    return String.valueOf((char) (90 - distance)) + replaceVowels(beforeConvert.substring(1));
                }
            }
            else if ((int) beforeConvert.charAt(0) <= 122) {
                int oldChar = (int) beforeConvert.charAt(0);
                int distance = oldChar - 97;
                if (beforeConvert.length() == 1) {
                    return String.valueOf((char) (122 - distance));
                }
                else {
                    return String.valueOf((char) (122 - distance)) + replaceVowels(beforeConvert.substring(1));
                }
            }
        }
            return beforeConvert.substring(0,1) + replaceVowels(beforeConvert.substring(1));
    }
}
