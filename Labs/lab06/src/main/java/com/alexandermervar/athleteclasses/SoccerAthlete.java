package com.alexandermervar.athleteclasses;

import com.alexandermervar.athleteabstractclasses.Athlete;

public class SoccerAthlete extends Athlete{

    //Constructors
    public SoccerAthlete() {
        super();
        setAthleteType("Soccer");
        setArenaType("Outdoor Stadium");
        numofHalves = 1;
        minutesPerHalf = 25;
    }
    public SoccerAthlete(String firstName, String lastName, String birthdate, String athleteID, String athleteTeam,
            String athleteType, String arenaType, int numofHalves, int minutesPerHalf) {
        super(firstName, lastName, birthdate, athleteID, athleteTeam, athleteType);
        setAthleteType("Soccer");
        this.setArenaType(arenaType);
        this.numofHalves = numofHalves;
        this.minutesPerHalf = minutesPerHalf;
    }

    //Variables
    private String arenaType;
    private int numofHalves;
    private int minutesPerHalf;

    //Getters and Setters
    public String getArenaType() {
        return arenaType;
    }
    public void setArenaType(String arenaType) {
        this.arenaType = arenaType;
    }
    public int getNumOfHalves() {
        return numofHalves;
    }
    public void setNumOfHalves(int numofHalves) {
        this.numofHalves = numofHalves;
    }
    public int getmMinutesPerHalf() {
        return minutesPerHalf;
    }
    public void setMinutesPerHalf(int minutesPerHalf) {
        this.minutesPerHalf = minutesPerHalf;
    }

    //Other Methods
    @Override
    public String toString() {
        return "Total Time Played: " + getTotalTimePlayed() + " minutes.";
    }
    @Override
    public int getTotalTimePlayed() {
        return numofHalves*minutesPerHalf;
    }
}
