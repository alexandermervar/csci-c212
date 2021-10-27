package com.alexandermervar.mouseListener;

import java.awt.*;
import java.awt.event.*;

/**
 * MouseListenerImplementation implements the MouseListener abstract class and defines the necessary
 * functions to complete section #1 as defined in `Lab8.pdf`.
 */
public class MouseListenerImplementation implements MouseListener{

    private int count;
    private int mouseX;
    private int mouseY;

    // Constructor
    public MouseListenerImplementation() {

        count = 0;

    }

    /**
     * When a mouse is clicked, the String "I love Java! I know MouseListeners and Interfaces!"
     * will print to the system.
     */
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("I love Java! I know MouseListeners and Interfaces!");
    }

    /**
     * When the mouse is pressed, the count variable is incremented and printed to the system.
     */
    @Override
    public void mousePressed(MouseEvent e) {
        count++;
        System.out.println(count);
        
    }

    /**
     * When the mouse is released, the x and y position of the cursor is found and then printed in the form
     * “(x, y) - Mouse was released”
     */
    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = MouseInfo.getPointerInfo().getLocation().x;
        mouseY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println("(" + mouseX + ", " + mouseY + ") - Mouse was released");
    }

    /**
     * Unnecessary for section of lab
     */
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    /**
     * Unnecessary for section of lab
     */
    @Override
    public void mouseExited(MouseEvent e) {        
    }
    
}
