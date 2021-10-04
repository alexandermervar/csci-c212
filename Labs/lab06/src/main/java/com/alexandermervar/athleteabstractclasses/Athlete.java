package com.alexandermervar.athleteabstractclasses;

public abstract class Athlete extends Person {
    
    // Constructors
    public Athlete() {
        super();
        athleteID = "001";
        athleteTeam = "Baltimore Ravens";
        athleteType = "American Football";
    }
    public Athlete(String firstName, String lastName, String birthdate, String athleteID, String athleteTeam,
            String athleteType) {
        super(firstName, lastName, birthdate);
        this.athleteID = athleteID;
        this.athleteTeam = athleteTeam;
        this.athleteType = athleteType;
    }

    // Variables
    private String athleteID;
    private String athleteTeam;
    private String athleteType;
    
    // Getters and Setters
    public String getAthleteID() {
        return athleteID;
    }
    public String getAthleteTeam() {
        return athleteTeam;
    }
    public String getAthleteType() {
        return athleteType;
    }
    public void setAthleteID(String athleteID) {
        this.athleteID = athleteID;
    }
    public void setAthleteTeam(String athleteTeam) {
        this.athleteTeam = athleteTeam;
    }
    public void setAthleteType(String athleteType) {
        this.athleteType = athleteType;
    }

    // Other Methods (Specific to Athlete Class)
    public String toString() {
        return "The abstactclasses.Athlete name is " + getFirstName() +  " " + getLastName();
    };
    
    public abstract int getTotalTimePlayed();
}
