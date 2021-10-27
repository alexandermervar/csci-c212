package com.alexandermervar.drawing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Flag extends JComponent{

    /**
     * Paints the flag - Flaggy Flag
     */
    @Override
    protected void paintComponent(Graphics g) {
        
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 200, 600);
        
        g.setColor(Color.WHITE);
        g.fillRect(200, 0, 200, 600);
        

        g.setColor(Color.DARK_GRAY);
        g.fillRect(400, 0, 400, 600);
        
    }
    
}
