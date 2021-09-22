package com.alexandermervar;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab4ExercisesTest {

    @Test
    public void exponentCalculator() {
        assertEquals(Lab4Exercises.exponentCalculator(3,2), 9);
        assertEquals(Lab4Exercises.exponentCalculator(4,5), 1024);
        assertEquals(Lab4Exercises.exponentCalculator(9,2), 81);
        assertEquals(Lab4Exercises.exponentCalculator(0,100), 0);
        assertEquals(Lab4Exercises.exponentCalculator(5,0), 1);
        assertThrows(IllegalArgumentException.class, () -> { // it wants the kind of exception and some code that may throw it
            Lab4Exercises.exponentCalculator(2, -4); // the () -> is an anonymous function, you may be familiar...
        });
    }

    @Test
    public void printMyBox() {
        assertEquals(Lab4Exercises.printMyBox(3,4), "###\n" + "###\n" + "###\n" + "###");
        assertEquals(Lab4Exercises.printMyBox(5,5), "#####\n" + "#####\n" + "#####\n" + "#####\n" + "#####");
        assertEquals(Lab4Exercises.printMyBox(7,3), "#######\n" + "#######\n" + "#######");
    }
}