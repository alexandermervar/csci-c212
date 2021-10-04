package com.alexandermervar;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.alexandermervar.athleteclasses.BasketballAthlete;
import com.alexandermervar.athleteclasses.HockeyAthlete;
import com.alexandermervar.athleteclasses.SoccerAthlete;

import org.junit.jupiter.api.Test;

public class AthleteTests {
    
    //Declare test athletes
    BasketballAthlete bball = new BasketballAthlete();
    HockeyAthlete hockey = new HockeyAthlete();
    SoccerAthlete soccer = new SoccerAthlete();

    @Test
    void testGetTotalTimePlayed() {
        assertEquals(bball.getTotalTimePlayed(), 16);
        assertEquals(hockey.getTotalTimePlayed(), 28);
        assertEquals(soccer.getTotalTimePlayed(), 25);
        bball.setNumOfQuarters(3);
        bball.setMinutesPerQuarter(4);
        assertEquals(bball.getTotalTimePlayed(), 12);
        hockey.setNumOfPeriods(17);
        hockey.setMinutesPerPeriod(2);
        assertEquals(hockey.getTotalTimePlayed(), 34);
        soccer.setNumOfHalves(15);
        soccer.setMinutesPerHalf(15);
        assertEquals(soccer.getTotalTimePlayed(), 225);
    }
}
