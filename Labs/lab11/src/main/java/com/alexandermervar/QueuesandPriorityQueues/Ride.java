package com.alexandermervar.QueuesandPriorityQueues;

import java.util.Queue;

public class Ride {
    
    // A ride class with instance variables for name, capacity, and a Queue of customers/passengers
    private String name;
    private int capacity;
    private Queue<Customer> passengers;

    // Setters and getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Queue<Customer> getPassengers() {
        return passengers;
    }
    public void setPassengers(Queue<Customer> passengers) {
        this.passengers = passengers;
    }

    // Constructor for the Ride class
    public Ride(String name, int capacity, Queue<Customer> passengers) {
        this.name = name;
        this.capacity = capacity;
        this.passengers = passengers;

    }

    // A run() function that removes people from the queue, up until the ride capacity is reached
    // Print out the order the people were removed from the queue along with their
    // fastpass status (if they were fastpassed)
    public void run() {
        int count = 0;
        while (count < capacity && passengers.size() > 0) {
            Customer customer = passengers.peek();
            if (customer.isFastPass()) {
                System.out.println("Fastpass: " + customer.getName());
            } else {
                System.out.println("Regular: " + customer.getName());
            }
            passengers.remove();
            count++;
        }
    }

    // An addToQueue() function that can add a ArrayList of customers to the ride's queue
    public void addToQueue(Queue<Customer> customers) {
        for (Customer customer : customers) {
            passengers.add(customer);
        }
    }

    // A toString() function that returns the ride's name, capacity, and the number of people in the queue
    @Override
    public String toString() {
        return "Ride: " + name + " Capacity: " + capacity + " Queue: " + passengers.size();
    }
}
