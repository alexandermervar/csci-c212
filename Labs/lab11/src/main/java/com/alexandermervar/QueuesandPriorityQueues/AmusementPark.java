package com.alexandermervar.QueuesandPriorityQueues;

import java.util.ArrayList;

public class AmusementPark {
    // A class that can hold an ArrayList of objects of type Ride
    private ArrayList<Ride> rides;

    // Constructor
    public AmusementPark(ArrayList<Ride> rides) {
        this.rides = rides;
    }

    // Getter and setter for rides
    public ArrayList<Ride> getRides() {
        return rides;
    }
    public void setRides(ArrayList<Ride> rides) {
        this.rides = rides;
    }
    public void addRide(Ride ride) {
        this.rides.add(ride);
    }

    // printRides() prints all the rides in the ArrayList
    public void printRides() {
        for (Ride ride : rides) {
            System.out.println(ride.toString());
        }
    }

}
