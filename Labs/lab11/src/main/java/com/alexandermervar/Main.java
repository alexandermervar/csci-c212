package com.alexandermervar;

import com.alexandermervar.Stacks.Stacks;
import com.alexandermervar.LinkedList.*;

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

        System.out.println("");

        System.out.println("reverseListNode(ListNode head)");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        ListNode.printListNode(head);
        System.out.println("");
        ListNode.printListNode(LinkedList.reverseListNode(head));
        System.out.println("");
        
        System.out.println("");

        System.out.println("isCycleInNode(ListNode node)");
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        System.out.println("Should be \"false\": " + LinkedList.isCycleInNode(head2));
        head2.next.next.next.next = head2.next.next;
        System.out.println("Should be \"true\": " + LinkedList.isCycleInNode(head2));
    }
}
