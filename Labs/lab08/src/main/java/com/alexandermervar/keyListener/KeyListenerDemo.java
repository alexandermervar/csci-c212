package com.alexandermervar.keyListener;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * KeyListenerDemo implements a main method and creates a JFrame and JPanel as defined in 'Lab8.pdf'
 */
public class KeyListenerDemo {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListenerDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(100,100));
        panel.setBackground(Color.white);
        panel.setFocusable(true);

        KeyListenerImplementation keyListener = new KeyListenerImplementation();

        panel.addKeyListener(keyListener);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
