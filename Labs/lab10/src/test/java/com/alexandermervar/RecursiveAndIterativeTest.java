package com.alexandermervar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RecursiveAndIterativeTest {
    

    // A test that checks the method isIntPalindromeIterative
    @Test
    void isIntPalindromeIterative() {
        RecursiveAndIterative test = new RecursiveAndIterative();
        assertEquals(false, test.isIntPalindromeIterative(100));
        assertEquals(true, test.isIntPalindromeIterative(252));
        assertEquals(false, test.isIntPalindromeIterative(123));
        assertEquals(true, test.isIntPalindromeIterative(123454321));
        assertEquals(false, test.isIntPalindromeIterative(1246644));
        assertEquals(true, test.isIntPalindromeIterative(12321));
        assertEquals(true, test.isIntPalindromeIterative(3));
    }

    // A test that checks the method isIntPalindromeRecursive
    @Test
    void isIntPalindromeRecursive() {
        RecursiveAndIterative test = new RecursiveAndIterative();
        assertEquals(false, test.isIntPalindromeRecursive(100));
        assertEquals(true, test.isIntPalindromeRecursive(252));
        assertEquals(false, test.isIntPalindromeRecursive(123));
        assertEquals(true, test.isIntPalindromeRecursive(123454321));
        assertEquals(false, test.isIntPalindromeRecursive(1246644));
        assertEquals(true, test.isIntPalindromeRecursive(12321));
        assertEquals(true, test.isIntPalindromeRecursive(3));
    }

    // A test that checks the method isStrPalindromeIterative
    @Test
    void isStrPalindromeIterative() {
        RecursiveAndIterative test = new RecursiveAndIterative();
        assertEquals(false, test.isStrPalindromeIterative("abc"));
        assertEquals(true, test.isStrPalindromeIterative("madam"));
        assertEquals(false, test.isStrPalindromeIterative("abcdefg"));
        assertEquals(true, test.isStrPalindromeIterative("abcba"));
        assertEquals(false, test.isStrPalindromeIterative("abcdefg"));
        assertEquals(true, test.isStrPalindromeIterative("abcba"));
        assertEquals(true, test.isStrPalindromeIterative("a"));
    }

    // A test that checks the method isStrPalindromeRecursive
    @Test
    void isStrPalindromeRecursive() {
        RecursiveAndIterative test = new RecursiveAndIterative();
        assertEquals(false, test.isStrPalindromeRecursive("abc"));
        assertEquals(true, test.isStrPalindromeRecursive("madam"));
        assertEquals(false, test.isStrPalindromeRecursive("abcdefg"));
        assertEquals(true, test.isStrPalindromeRecursive("abcba"));
        assertEquals(false, test.isStrPalindromeRecursive("abcdefg"));
        assertEquals(true, test.isStrPalindromeRecursive("abcba"));
        assertEquals(true, test.isStrPalindromeRecursive("a"));
    }
}
