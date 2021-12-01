package com.alexandermervar;

import com.alexandermervar.Stacks.Stacks;

public class Main {
    public static void main(String[] args) {
        System.out.println("isIntPalindrome(int n)");
        System.out.println("Should be \"true\": " + Stacks.isIntPalindrome(101));
        System.out.println("Should be \"true\": " + Stacks.isIntPalindrome(121));
        System.out.println("Should be \"true\": " + Stacks.isIntPalindrome(12321));
        System.out.println("Should be \"false\": " + Stacks.isIntPalindrome(1222));
        System.out.println("Should be \"false\": " + Stacks.isIntPalindrome(12));
        System.out.println("Should be \"false\": " + Stacks.isIntPalindrome(1235233432));

        System.out.println("");

        System.out.println("isStringPalinfrome(String s)");
        System.out.println("Should be \"true\": " + Stacks.isStringPalindrome("racecar"));
        System.out.println("Should be \"true\": " + Stacks.isStringPalindrome("madam"));
        System.out.println("Should be \"true\": " + Stacks.isStringPalindrome("abCcba"));
        System.out.println("Should be \"true\": " + Stacks.isStringPalindrome("aBzba"));
        System.out.println("Should be \"false\": " + Stacks.isStringPalindrome("acba"));
        System.out.println("Should be \"false\": " + Stacks.isStringPalindrome("abcd"));
        System.out.println("Should be \"false\": " + Stacks.isStringPalindrome("abtcba"));

    }
}
