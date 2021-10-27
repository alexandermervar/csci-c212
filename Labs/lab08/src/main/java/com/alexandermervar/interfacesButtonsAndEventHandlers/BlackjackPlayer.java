package com.alexandermervar.interfacesButtonsAndEventHandlers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BlackjackPlayer {
    
    public static int[] handTotals = new int[2];
    public static boolean bust = false;
    public static JLabel totalsLabel = new JLabel("");
    public static JLabel dealerLabel = new JLabel("");
    public static JButton hit = new JButton("Hit!");;
    public static JButton stay = new JButton("Stay!");;

    public static void main(String[] args) {

        Cards oneCards = new Cards(false);

        int tempCard = oneCards.addCard();

        if (tempCard == 1) {
            handTotals[0] += tempCard;
            handTotals[1] += tempCard + 10;
        }
        else {
            handTotals[0] += tempCard;
            handTotals[1] += tempCard;
        }

        tempCard = oneCards.addCard();

        if (tempCard == 1) {
            handTotals[0] += tempCard;
            handTotals[1] += tempCard + 10;
        }
        else {
            handTotals[0] += tempCard;
            handTotals[1] += tempCard;
        }

        dealerLabel.setText("Dealer has " + oneCards.addCard() + " + ???");

        totalsLabel.setText("Hand Value: " + displayHand(handTotals));

        JFrame frame = new JFrame();
        JPanel mainPanel = new JPanel();
        JPanel statusPanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(400, 400));

        mainPanel.add(statusPanel);
        mainPanel.add(buttonsPanel);

        hit.addActionListener(new HitButtonListener());
        stay.addActionListener(new StayButtonListener());

        hit.setEnabled(true);
        stay.setEnabled(true);


        buttonsPanel.add(hit);
        buttonsPanel.add(stay);


        statusPanel.add(dealerLabel);
        statusPanel.add(totalsLabel);

        frame.add(mainPanel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static String displayHand(int[] hand) {
        if (hand[0] != hand[1]) {
            return Integer.toString(hand[0]) + ", " + hand[1];
        }
        else {
            return Integer.toString(hand[0]);
        }
    }

    // deal the player a new card, 
    // checking if the player has “busted” -- gone over 21.

    /**
     * If the player busts, disable both buttons and, 
     * instead of displaying the player’s hand value(s), 
     * update the text of totalsLabel to “Bust!” Otherwise, simply update the text of totalsLabel with the new value(s).
     */
    public static class HitButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Cards oneCards = new Cards(false);
            int tempCard = oneCards.addCard();

        if (tempCard == 1) {
            handTotals[0] += tempCard;
            handTotals[1] += tempCard + 10;
        }
        else {
            handTotals[0] += tempCard;
            handTotals[1] += tempCard;
        }

        totalsLabel.setText("Hand Value: " + displayHand(handTotals));

        if (handTotals[0] > 21 && handTotals[1] > 21) {
            hit.setEnabled(false);
            stay.setEnabled(false);
            totalsLabel.setText("BUST!");
        }
            
        }

    }

    /**
     * When the action is performed, disable both buttons.
     */
    public static class StayButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            hit.setEnabled(false);
            stay.setEnabled(false);
        }

    }
}
