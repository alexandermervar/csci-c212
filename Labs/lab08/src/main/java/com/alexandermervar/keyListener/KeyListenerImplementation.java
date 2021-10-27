package com.alexandermervar.keyListener;

import java.awt.*;
import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

/**
 * KeyListnerImplementation implements the KeyListner abstract class and defines the necessary
 * functions to complete section #2 as define in 'Lab8.pdf'.
 */
public class KeyListenerImplementation implements KeyListener{

    private int count;

    // Constructor
    public KeyListenerImplementation() {
        count = 0;
    }

    /**
     * Everytime the user clicks a key, do the following depending on key:
■ If the user clicks ‘e’, exit the application.
■ If the user clicks ‘h’, print “Hello World” to the console.
■ All other input should be echoed back to the console.
     */
    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getKeyChar() == 'e') {
            System.exit(0);
        }
        else if (e.getKeyChar() == 'h') {
            System.out.println("Hello World");
        }
        else {
            System.out.println(e.getKeyChar());
        }
    }

    /**
     * Everytime the user presses a key, it should increment a counter by 1 and print 
     * that to the console in the form: “You have pressed the keyboard n times”.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        count++;
        System.out.println("You have pressed the keyboard " + count + " times.");
    }

    /**
     * Everytime the user releases a key, it should print the key pressed and 
     * ASCII integer value to the console in the form: “letter, ascii integer value”.
     */
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar() + ", " + (int) e.getKeyChar());
    }
    
}
