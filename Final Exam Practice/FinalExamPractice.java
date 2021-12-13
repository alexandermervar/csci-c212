/**
 * 1. Create a private class implementing the ActionListener interface that displays the value of a counter variable. 
 * The counter variable is defined in an enclosing public class that displays a panel with a button to which the ActionListener is tied (Example from the lecture).
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;

    public PushCounterPanel()
    {
        count = 0;
        push = new JButton("Push Me!");
        push.addActionListener(new ButtonListener());
        label = new JLabel("Pushes: " + count);
        add(push);
        add(label);
        setPreferredSize(new Dimension(300, 40));
        setBackground(Color.cyan);
    }
    //*************************************************************
    //  Represents a listener for button push (action) events.
    //*************************************************************
    private class ButtonListener implements ActionListener
    {
        //----------------------------------------------------------
        //  Updates the counter and label when the button is pushed.
        //----------------------------------------------------------
        public void actionPerformed(ActionEvent event)
        {
            count++;
            label.setText("Pushes: " + count);
        }
    }
}

/**
 * 2. Write a method that iterate through an array using a for loop and catch any ArrayIndexOutOfBoundsException without breaking the loop
*/

public class ExceptionHandling{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        iterateArray(arr);
    }

    public static void iterateArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            try{
                System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bounds");
            }
        }
    }
}

/**
 * 3. Write a Java program to join two linked lists using the Collections framework
*/

public LinkedList combineLinkedLists(LinkedList linkOne, LinkedList linkTwo){
    LinkedList combinedList = new LinkedList();
    combinedList.addAll(linkOne);
    combinedList.addAll(linkTwo);
    return combinedList;
}

/**
 * 4. Write a Java program to shuffle the elements in a linked list using the Collection framework
*/

public LinkedList shuffleLinkedList(LinkedList link){
    Collections.shuffle(link);
    return link;
}

/**
 * 5. Write a Java program to sort keys in Tree Map by using comparator using the Collection
 * framework
*/

class sort_key implements Comparator<String>{
    @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
    
}

/**
 * 6. We have triangle made of blocks. The topmost row has 1 block, the next row down has 
 * 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
 * triangle(0) → 0 triangle(1) → 1 triangle(2) → 3
*/

public int triangle(int rows){
    if(rows == 0){
        return 0;
    }
    else{
        return rows + triangle(rows - 1);
    }
}

/**
 * 7. Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared)
 * powerN(3, 1) → 3 powerN(3, 2) → 9 powerN(3, 3) → 27
*/

public int powerN(int base, int n){
    if(n == 1){
        return base;
    }
    else{
        return base * powerN(base, n - 1);
    }
}

/**
 * 8. Give a map of key, values pairs modify and return the map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"} mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
 * mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
*/

public Map<String, String> mapShare(Map<String, String> map){
    if(map.containsKey("a")){
        map.put("b", map.get("a"));
    }
    map.remove("c");
    return map;
}

/*
 * 9. Given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".
 * topping2({"ice cream": "cherry"}) → {"yogurt": "cherry", "ice cream": "cherry"} topping2({"spinach": "dirt", "ice cream": "cherry"}) → {"yogurt": "cherry", "spinach": "nuts", "ice cream": "cherry"}
 * topping2({"yogurt": "salt"}) → {"yogurt": "salt"}
*/

public Map<String, String> topping2(Map<String, String> map){
    if(map.containsKey("ice cream")){
        map.put("yogurt", map.get("ice cream"));
    }
    if(map.containsKey("spinach")){
        map.put("spinach", "nuts");
    }
    return map;
}

/**
 * 10. Perform a preoder, postorder, inorder and breadth first traversal of the BST given in Figure 1
*/

class Node {
    int key;
    Node left, right;
 
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
 
class BinaryTree {
    // Root of Binary Tree
    Node root;
 
    BinaryTree() { root = null; }
 
    /* Given a binary tree, print its nodes according to the
      "bottom-up" postorder traversal. */
    void printPostorder(Node node)
    {
        if (node == null)
            return;
 
        // first recur on left subtree
        printPostorder(node.left);
 
        // then recur on right subtree
        printPostorder(node.right);
 
        // now deal with the node
        System.out.print(node.key + " ");
    }
 
    /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.key + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
 
    /* Given a binary tree, print its nodes in preorder*/
    void printPreorder(Node node)
    {
        if (node == null)
            return;
 
        /* first print data of node */
        System.out.print(node.key + " ");
 
        /* then recur on left subtree */
        printPreorder(node.left);
 
        /* now recur on right subtree */
        printPreorder(node.right);
    }
 
    // Wrappers over above recursive functions
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
 
    // Driver method
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        System.out.println(
            "\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}

// -------------------------------------------------------------

// Recursive Java program for level
// order traversal of Binary Tree
 
/* Class containing left and right child of current
   node and key value*/
   class Node {
    int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
class BinaryTree {
    // Root of the Binary Tree
    Node root;
 
    public BinaryTree() { root = null; }
 
    /* function to print level order traversal of tree*/
    void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(root, i);
    }
 
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
 
            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }
 
    /* Print nodes at the current level */
    void printCurrentLevel(Node root, int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
 
    /* Driver program to test above functions */
    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
       System.out.println("Level order traversal of
                                 binary tree is ");
       tree.printLevelOrder();
    }
}

/**
 * 11. Add a node with value 30 in binary search tree in given in Figure 1
*/

public class BinarySearchTree {
    …

    public boolean add(int value) {
          if (root == null) {
                root = new BSTNode(value);
                return true;
          } else
                return root.add(value);
    }
}

/**
 * 12. Perform insertion and selection sort on the following list of numbers. Show all the
 * intermediate steps: 23, 40, 4, 6, 20, 12
 */

class InsertionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
  
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}

// -------------------------------------------------------------

class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
