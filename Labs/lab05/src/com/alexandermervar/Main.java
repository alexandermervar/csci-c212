package com.alexandermervar;


import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Exercise 1: minMaxStrings
        Scanner sc = new Scanner(System.in);
        System.out.println("This function will calculate the String with the " +
                "smallest number of characters and the String with the largest number of characters.");

        String user = "";
        ArrayList<String> userStrings = new ArrayList<String>();

        while(user.equals("-1") != true) {
            System.out.println("Input a String: ");
            user = sc.nextLine();
            if (user.equals("-1") != true) {
                userStrings.add(user);
            }
        }

        Lab05Exercises.minMaxOfStrings(userStrings);

        System.out.println();
        // Exercise 3 - Student Directory

        int[][] students = {
                {1, 18, 12, 100},
                {2, 17, 11, 75},
                {3, 14, 9, 35},
                {4, 18, 11, 55},
                {5, 18, 12, 95}
        };

        System.out.println("Please input the minimum age for the student filter: ");
        int minAgeFilter = Integer.parseInt(sc.nextLine());

        System.out.println();
        System.out.println("Please input the minimum year for the student filter: ");
        int minYearFilter = Integer.parseInt(sc.nextLine());

        System.out.println();
        System.out.println("Please input the minimum grade for the student filter: ");
        int minGradeFilter = Integer.parseInt(sc.nextLine());

        int[] filteredStudentIDs = Lab05Exercises.filterStudents(students, minAgeFilter, minYearFilter, minGradeFilter);

        System.out.print("Filtered Students: [");
        for(int i = 0; i < filteredStudentIDs.length; i++) {
            if(i == filteredStudentIDs.length-1) {
                System.out.print(filteredStudentIDs[i]);
            }
            else {
                System.out.print(filteredStudentIDs[i] + ", ");
            }
        }
        System.out.print("]\n");
    }
}
