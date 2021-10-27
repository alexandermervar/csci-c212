package com.alexandermervar.mouseListener;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * MouseListenerDemo implements a main method that creates a JFrame and JPanel as defined in `Lab8.pdf`.
 */
public class MouseListenerDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListenerDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(50, 50));

        MouseListenerImplementation mouseListener = new MouseListenerImplementation();

        panel.addMouseListener(mouseListener);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
