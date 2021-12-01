package com.alexandermervar.LinkedList;

import java.util.ArrayList;

public class LinkedList {
    
    // The function reverseList(), which reverses a linked list.
    // Reverse the given node from arg1 to arg2.

    // Output Example:
    // input 5->4->3->2->1, 0, 1 return 4->5->3->2->1
    // input 5->4->3->2->1, 0, 4 return 1->2->3->4->5
    // input 5->4->3->2->1, 0, 5 return null, and print "either start or end is wrong"
    // input 5->4->3->2->1, 5, 0 return null, and print "end can't be smaller than start"

    // This function basically works in a similar fashion to the helper by keeping track of the previous node and the current node.
    // The difference here is that is takes into account if it is in the area that is required to be reversed or not.
    // If it is not in the area to be reversed, then it just moves on to the next node and is sure to not reverse it.
    // If it is in the area to be reversed, then it reverses it and moves on to the next node.
    // The function used pointers, which is why it is possible for me to return the variable head.
    
    public static ListNode reverseList(ListNode head, int start, int end) {
        if (start > end) {
            System.out.println("end can't be smaller than start");
            return null;
        }
        else if (start >= head.size(head) || end >= head.size(head) || start < 0 || end < 0) {
            System.out.println("either start or end is wrong");
            return null;
        }
        else if (head.size(head) == 1 || start == end) {
            return head;
        }
        else {
            ListNode reverse = null;
            ListNode reversePrevious = null;
            ListNode reverseEnd = null;
            ListNode reverseEndNext = null;

            int i = 0;
            ListNode current = head;

            while (current != null && i <= end) {
                if (i < start) {
                    reversePrevious = current;
                }
                else if (i == start) {
                    reverse = current;
                }
                else if (i == end) {
                    reverseEnd = current;
                    reverseEndNext = current.next;
                }
                else {
                    current = current.next;
                    i++;
                }
            }

            reverseEnd.next = null;

            reverseEnd = reverseListNode(reverse)

            if (reversePrevious == null) {
                head = reverseEnd;
            }
            else {
                reversePrevious.next = reverseEnd;
            }

            reverse.next = reverseEndNext;
            return head;
        }
    }

    // The helper function reverseListNode(), which reverses a ListNode linked list.
    // Basically, this function take a ListNode and uses the prev variable to keep track of what it has seen as it iterates through the
    // linked list. Upon arrival of the end of the linked list, it will return the prev variable.

    public static ListNode reverseListNode(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // The function isCycleInNode(ListNode node), which checks if a linked list has a cycle.
    // Output Example:
    // input 5->4->3->2->1, return false
    // input 5->4->3->2->1->5, return true
    // input 5->4->3->2->1->5->6, return true

    public static boolean isCycleInNode(ListNode node) {
        ListNode current = node;

        ArrayList seen = new ArrayList();

        while(current != null) {
            if (seen.contains(current)) {
                return true;
            }
            else {
                seen.add(current);
                current = current.next;
            }
        }
        return false;
    }

}