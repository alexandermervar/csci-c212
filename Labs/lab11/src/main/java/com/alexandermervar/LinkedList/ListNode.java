package com.alexandermervar.LinkedList;

public class ListNode {
    
    public int val;
    public ListNode next;

    public ListNode(int val) { 
        this.val = val; 
    }

    public ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    } 

    public static int size(ListNode node) {
        int count=0;
        ListNode temp = node; 
        while(temp!=null) {
            temp = temp.next;
            count++; 
        }
    return count; 
    }

    public static void printListNode (ListNode node) {
        while (node.next != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.print(node.val);
    }
}
