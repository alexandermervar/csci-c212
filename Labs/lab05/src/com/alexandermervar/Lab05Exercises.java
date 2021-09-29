package com.alexandermervar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab05Exercises {

    public static void minMaxOfStrings(ArrayList<String> userInput) {
        ArrayList<Integer> lengthsOfStrings = new ArrayList<Integer>();
        int[] minAndMax = new int[2];
        String[] minAndMaxStrings = new String[2];

        // Arraylist of Lengths
        for(int i=0; i < userInput.size(); i ++) {
            lengthsOfStrings.add(userInput.get(i).length());
        }

        // Find the Minimum Values
        minAndMax[0] = Collections.min(lengthsOfStrings);
        minAndMaxStrings[0] = userInput.get(lengthsOfStrings.indexOf(Collections.min(lengthsOfStrings)));

        // Find the Maximum Values
        minAndMax[1] = Collections.max(lengthsOfStrings);
        minAndMaxStrings[1] = userInput.get(lengthsOfStrings.indexOf(Collections.max(lengthsOfStrings)));

        System.out.println("Output: " + "[" + minAndMax[0] + ", " + minAndMax[1] + "] "
                + "[" + minAndMaxStrings[0] + ", " + minAndMaxStrings[1] + "]");
    }

    public static int[] filterStudents(int[][] studentDirectory, int minAge, int minYear, int minGrade) {

        int[] returnFilteredIDs = {};
        int meetFilter = 0;

        for (int i = 0; i < studentDirectory.length; i++) {

            // Filter
            if(studentDirectory[i][1] >= minAge && studentDirectory[i][2] >= minYear && studentDirectory[i][3] >= minGrade) {
                returnFilteredIDs = Arrays.copyOf(returnFilteredIDs, returnFilteredIDs.length+1);
                returnFilteredIDs[meetFilter] = studentDirectory[i][0];
                meetFilter++;
            }

        }

        return returnFilteredIDs;
    }

}
