package com.alexandermervar.athleteclasses;

import com.alexandermervar.athleteabstractclasses.Athlete;

public class BasketballAthlete extends Athlete{

    //Constructors
    public BasketballAthlete() {
        super();
        setAthleteType("Basketball");
        setArenaType("Indoor Stadium");
        setNumOfQuarters(4);
        setMinutesPerQuarter(4);
    }
    public BasketballAthlete(String firstName, String lastName, String birthdate, String athleteID, String athleteTeam,
            String athleteType, String arenaType, int numOfQuarters, int minutesPerQuarter) {
        super(firstName, lastName, birthdate, athleteID, athleteTeam, athleteType);
        setAthleteType("Basketball");
        this.setArenaType(arenaType);
        this.setNumOfQuarters(numOfQuarters);
        this.setMinutesPerQuarter(minutesPerQuarter);
    }

    //Variables
    private String arenaType;
    private int numOfQuarters;
    private int minutesPerQuarter;

    //Getters and Setters
    public String getArenaType() {
        return arenaType;
    }
    public void setArenaType(String arenaType) {
        this.arenaType = arenaType;
    }
    public int getNumOfQuarters() {
        return numOfQuarters;
    }
    public void setNumOfQuarters(int numOfQuarters) {
        this.numOfQuarters = numOfQuarters;
    }
    public int getMinutesPerQuarter() {
        return minutesPerQuarter;
    }
    public void setMinutesPerQuarter(int minutesPerQuarter) {
        this.minutesPerQuarter = minutesPerQuarter;
    }

    //Other Methods
    @Override
    public String toString() {
        return "Total Time Played: " + getTotalTimePlayed() + " minutes.";
    }
    @Override
    public int getTotalTimePlayed() {
        return numOfQuarters*minutesPerQuarter;
    }
    
}
