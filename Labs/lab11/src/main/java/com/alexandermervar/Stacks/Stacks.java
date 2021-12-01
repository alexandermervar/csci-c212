package com.alexandermervar.Stacks;

import java.util.Stack;

public class Stacks {
    
    // The function isIntPalindrome which takes an integer and returns true if it is a palindrome, false otherwise.
    // This function uses the stacks collection to solve the problem.

    // Output Example:
    // Boolean isIntPalindrome(101) -> true
    // Boolean isIntPalindrome(1221) -> true
    // Boolean isIntPalindrome(1222) -> false
    // Boolean isIntPalindrome(131415) -> false

    public static boolean isIntPalindrome(int num) {
        Stack<Integer> stack = new Stack<Integer>();
        int temp = num;
        while (temp > 0) {
            stack.push(temp % 10);
            temp /= 10;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != num % 10) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    // The function isStringPalindrome which takes a string and returns true if it is a palindrome, false otherwise.
    // This function uses the stacks collection to solve the problem.

    // Output Example:
    // Boolean isStringPalindrome("racecar") -> true
    // Boolean isStringPalindrome("racecar1") -> false
    // Boolean isStringPalindrome("abCcba") -> true
    // Boolean isStringPalindrome("aBzba") -> false
    // Boolean isStringPalindrome("") -> true
    // Boolean isStringPalindrome("acba") -> false

    public static boolean isStringPalindrome(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(Character.toLowerCase(str.charAt(i)));
        }
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != Character.toLowerCase(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
