package com.alexandermervar.interfacesButtonsAndEventHandlers;

import java.util.Random;

/**
 * Cards.java is a help class that deals with the complexity of weighted proabilities when slecting a card value
 */
public class Cards {

    private boolean aceEleven;

    // Constructor
    public Cards(boolean b) {
        aceEleven = b;
    }

    // Returns a card value when called
    public int addCard() {
        Random rand = new Random();
        int random = rand.nextInt(13) + 1;
        if (random == 13 && aceEleven != true) {
            return 11;
        }
        else if (random == 13 && aceEleven != false) {
            return 1;
        }
        else if (random == 10 || random == 11 || random == 12) {
            return 10;
        }
        else {
            return random;
        }
    }

}
