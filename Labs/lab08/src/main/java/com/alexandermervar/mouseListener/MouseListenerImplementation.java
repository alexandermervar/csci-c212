package com.alexandermervar.mouseListener;

import java.awt.*;
import java.awt.event.*;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class MouseListenerImplementation implements MouseListener{

    private int count;
    private int mouseX;
    private int mouseY;

    public MouseListenerImplementation() {

        count = 0;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("I love Java! I know MouseListeners and Interfaces!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        count++;
        System.out.println(count);
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouseX = MouseInfo.getPointerInfo().getLocation().x;
        mouseY = MouseInfo.getPointerInfo().getLocation().y;
        System.out.println("(" + mouseX + ", " + mouseY + ") - Mouse was released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    
}
