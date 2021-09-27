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

    }
}
