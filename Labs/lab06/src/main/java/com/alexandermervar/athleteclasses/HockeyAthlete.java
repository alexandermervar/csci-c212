package com.alexandermervar.athleteclasses;

import com.alexandermervar.athleteabstractclasses.Athlete;

public class HockeyAthlete extends Athlete{
    
    //Constructors
    public HockeyAthlete() {
        super();
        setAthleteType("Hockey");
        setArenaType("Ice Rink");
        numOfPeriods = 4;
        minutesPerPeriod = 7;
    }
    public HockeyAthlete(String firstName, String lastName, String birthdate, String athleteID, String athleteTeam,
            String athleteType, String arenaType, int numOfPeriods, int minutesPerPeriod) {
        super(firstName, lastName, birthdate, athleteID, athleteTeam, athleteType);
        setAthleteType("Hockey");
        this.setArenaType(arenaType);
        this.numOfPeriods = numOfPeriods;
        this.minutesPerPeriod = minutesPerPeriod;
    }

    //Variables
    private String arenaType;
    private int numOfPeriods;
    private int minutesPerPeriod;

    //Getters and Setters
    public String getArenaType() {
        return arenaType;
    }
    public void setArenaType(String arenaType) {
        this.arenaType = arenaType;
    }
    public int getNumOfPeriods() {
        return numOfPeriods;
    }
    public void setNumOfPeriods(int numOfPeriods) {
        this.numOfPeriods = numOfPeriods;
    }
    public int getMinutesPerPeriod() {
        return minutesPerPeriod;
    }
    public void setMinutesPerPeriod(int minutesPerPeriod) {
        this.minutesPerPeriod = minutesPerPeriod;
    }
    
    // Other Methods
    @Override
    public String toString() {
        return "Total Time Played: " + getTotalTimePlayed() + " minutes.";
    }
    @Override
    public int getTotalTimePlayed() {
        return numOfPeriods * minutesPerPeriod;
    }

    
}
