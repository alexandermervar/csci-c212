package com.alexandermervar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab05ExercisesTest {


    int[][] students = {
            {1, 18, 12, 90},
            {2, 17, 11, 75},
            {3, 14, 9, 35},
            {4, 18, 11, 55},
            {5, 18, 12, 95}
    };

    @Test
    void filterStudents() {
        int[] expectedResultTestOne = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedResultTestOne, Lab05Exercises.filterStudents(students, -1, -1, -1));
        assertArrayEquals(new int[] {}, Lab05Exercises.filterStudents(students, 15, 12, 96));
        assertArrayEquals(new int[] {5}, Lab05Exercises.filterStudents(students, 18, 12, 95));
    }
}