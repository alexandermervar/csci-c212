package com.alexandermervar;

public class RecursiveAndIterative {
    
    // A function that iteratively checks to see if the given int is a palindrome
    public boolean isIntPalindromeIterative(int n) {
        // Checks to see if the given number is a palindrome using iteration and modulus
        int original = n;
        int reverse = 0;

        // Compute the reverse of the number
        while (original > 0) {
            reverse = reverse * 10 + original % 10;
            original /= 10;
        }

        return n == reverse;
    }

    // A function that recursively checks to see if the given int is a palindrome
    public boolean isIntPalindromeRecursive(int n) {
        // Checks to see if the given number is a palindrome using recursion and modulus
        if (n < 10) {
            return true;
        }
        else if (n % 10 == 0) {
            return false;
        }
        else {
            int newDigit = n / 10;
            newDigit = newDigit % (int) Math.pow(10, (int) Math.log10(newDigit));
            return isIntPalindromeRecursive(newDigit) && n % 10 == (int) Math.floor(n / Math.pow(10, Math.floor(Math.log10(n))));
        }
    }

    // A function that iteratively checks to see if the given string is a palindrome
    public boolean isStrPalindromeIterative(String s) {
        // Checks to see if the given string is a palindrome using iteration
        int length = s.length();
        int i = 0;
        int j = length - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    // A function that recursively checks to see if the given string is a palindrome
    public boolean isStrPalindromeRecursive(String s) {
        // Checks to see if the given string is a palindrome using recursion
        if (s.length() == 1) {
            return true;
        }
        else if (s.length() == 0) {
            return false;
        }
        else {
            return s.charAt(0) == s.charAt(s.length() - 1) && isStrPalindromeRecursive(s.substring(1, s.length() - 1));
        }
    }
}