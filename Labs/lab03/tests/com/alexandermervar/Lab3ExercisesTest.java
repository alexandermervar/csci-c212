package com.alexandermervar;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lab3ExercisesTest {

    @Test
    public void pigLatinEncoder() {
        assertEquals(Lab3Exercises.pigLatinEncoder("horse"), "orse-hay");
        assertEquals(Lab3Exercises.pigLatinEncoder("Rhythm"), "ythm-Rhay");
        assertEquals(Lab3Exercises.pigLatinEncoder("You must love using Java"), "ou-Yay ust-may ove-lay using-way ava-Jay");
        assertEquals(Lab3Exercises.pigLatinEncoder("Apple"), "Apple-way");
        assertEquals(Lab3Exercises.pigLatinEncoder("Young"), "oung-Yay");
        assertEquals(Lab3Exercises.pigLatinEncoder("Murphy"), "urphy-May");
    }

    @Test
    public void pigLatinDecoder() {
    }
}