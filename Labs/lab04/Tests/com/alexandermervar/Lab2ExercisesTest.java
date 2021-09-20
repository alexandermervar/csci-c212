package com.alexandermervar;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab2ExercisesTest {

    @Test
    public void exponentCalculator() {
        assertEquals(Lab2Exercises.exponentCalculator(3,2), 9);
        assertEquals(Lab2Exercises.exponentCalculator(4,5), 1024);
        assertEquals(Lab2Exercises.exponentCalculator(9,2), 81);
        assertEquals(Lab2Exercises.exponentCalculator(0,100), 0);
        assertEquals(Lab2Exercises.exponentCalculator(5,0), 1);
        assertThrows(IllegalArgumentException.class, () -> { // it wants the kind of exception and some code that may throw it
            Lab2Exercises.exponentCalculator(2, -4); // the () -> is an anonymous function, you may be familiar...
        });
    }
}