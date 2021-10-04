package com.alexandermervar.athleteclasses;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class AthleteMain {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initiating Variables for Loop
        String athleteName = "";
        String athleteBirthdate = "";
        String athleteType = "";
        String athleteTeam = "";
        String athleteID = "";
        
        System.out.println("Enter the Number of Athletes: ");
        int numOfAthletes = Integer.parseInt(sc.nextLine());

        for(int i=0; i<numOfAthletes; i++) {
            System.out.println("Enter the following information for Athlete " + i+1 + ":");
            System.out.print("Name: ");
            athleteName = sc.nextLine();
            System.out.println();
            System.out.print("Birthdate: ");
            athleteBirthdate = sc.nextLine();
            System.out.println();
            System.out.print("Athlete Type: ");
            athleteType = sc.nextLine();
            System.out.println();
            System.out.print("Team Played For: ");
            athleteTeam = sc.nextLine();
            System.out.println();
            System.out.print("ID: ");
            athleteID = sc.nextLine();
            System.out.println();

            if(athleteType.equals("Hockey")) {
                HockeyAthlete userAthlete = new HockeyAthlete();
                String nameArr[] = athleteName.split(" ");
                userAthlete.setFirstName(nameArr[0]);
                userAthlete.setLastName(nameArr[1]);
                userAthlete.setBirthdate(athleteBirthdate);
                userAthlete.setAthleteType(athleteType);
                userAthlete.setAthleteTeam(athleteTeam);
                userAthlete.setAthleteID(athleteID);
                System.out.println(userAthlete.toString());
            }
            else if(athleteType.equals("Basketball")) {
                BasketballAthlete userAthlete = new BasketballAthlete();
                String nameArr[] = athleteName.split(" ");
                userAthlete.setFirstName(nameArr[0]);
                userAthlete.setLastName(nameArr[1]);
                userAthlete.setBirthdate(athleteBirthdate);
                userAthlete.setAthleteType(athleteType);
                userAthlete.setAthleteTeam(athleteTeam);
                userAthlete.setAthleteID(athleteID);
                System.out.println(userAthlete.toString());
            }
            else {
                SoccerAthlete userAthlete = new SoccerAthlete();
                String nameArr[] = athleteName.split(" ");
                userAthlete.setFirstName(nameArr[0]);
                userAthlete.setLastName(nameArr[1]);
                userAthlete.setBirthdate(athleteBirthdate);
                userAthlete.setAthleteType(athleteType);
                userAthlete.setAthleteTeam(athleteTeam);
                userAthlete.setAthleteID(athleteID);
                System.out.println(userAthlete.toString());
            }
        }

        sc.close();

    }
}