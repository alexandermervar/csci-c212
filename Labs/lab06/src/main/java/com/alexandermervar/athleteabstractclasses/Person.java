package com.alexandermervar.athleteabstractclasses;

public class Person {
    
    // Variables
    private String firstName;
    private String lastName;
    private String birthdate;
    
    // Constructors
    public Person() {
        firstName = "Alexander";
        lastName = "Mervar";
        birthdate = "September 13, 2000";
    }
    public Person(String firstName, String lastName, String birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    public String getBirthdate() {
        return birthdate;
    }
    public String getLastName() {
        return lastName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


}
