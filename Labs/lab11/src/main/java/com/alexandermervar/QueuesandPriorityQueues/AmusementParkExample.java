package com.alexandermervar.QueuesandPriorityQueues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class AmusementParkExample {
    public static void main(String[] args) {
        PriorityQueue<Customer> screamerLine = new PriorityQueue<>();
        Ride priorityRide1 = new Ride("FastPass - Screamer", 4, screamerLine);
        screamerLine.add(new Customer("Alexander", true));
        screamerLine.add(new Customer("Jennifer", false));
        screamerLine.add(new Customer("Perry", false));
        screamerLine.add(new Customer("Haley", true));
        screamerLine.add(new Customer("Samantha", false));
        screamerLine.add(new Customer("Sophia", true));
        screamerLine.add(new Customer("Sophie", false));
        screamerLine.add(new Customer("Steve", false));
        screamerLine.add(new Customer("Chris", false));
        screamerLine.add(new Customer("Martin", true));


        Queue<Customer> rollerCoasterLine = new LinkedList<>();
        Ride noPriorityRide2 = new Ride("Roller Coaster", 3, rollerCoasterLine);
        rollerCoasterLine.add(new Customer("Alexander", true));
        rollerCoasterLine.add(new Customer("Jennifer", false));
        rollerCoasterLine.add(new Customer("Perry", false));
        rollerCoasterLine.add(new Customer("Haley", true));
        rollerCoasterLine.add(new Customer("Samantha", false));
        rollerCoasterLine.add(new Customer("Sophia", true));
        rollerCoasterLine.add(new Customer("Sophie", false));
        rollerCoasterLine.add(new Customer("Steve", false));
        rollerCoasterLine.add(new Customer("Chris", false));
        rollerCoasterLine.add(new Customer("Martin", true));

        while (priorityRide1.getPassengers().size() > 0 || noPriorityRide2.getPassengers().size() > 0) {
            System.out.println("------------------------------------------------------");
            System.out.println("Running Rides:");
            System.out.println("");
            if (priorityRide1.getPassengers().size() > 0) {
                System.out.println("Priority Ride: " + priorityRide1.getName());
                priorityRide1.run();
                System.out.println();
            }
            if (noPriorityRide2.getPassengers().size() > 0) {
                System.out.println("No Priority Ride: " + noPriorityRide2.getName());
                noPriorityRide2.run();
            }
            System.out.println("");
        }
    }
}
