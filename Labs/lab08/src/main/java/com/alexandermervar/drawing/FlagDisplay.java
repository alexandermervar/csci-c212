package com.alexandermervar.drawing;

import java.awt.*;
import javax.swing.*;

/**
 * The FlagDisplay class creates teh necessary frame and JComponent to paint the flag Flaggy Flag
 */
public class FlagDisplay {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flaggy Flag");
        frame.setSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Flag flaggyFlag = new Flag();

        frame.add(flaggyFlag);
        frame.setVisible(true);
    }
}
