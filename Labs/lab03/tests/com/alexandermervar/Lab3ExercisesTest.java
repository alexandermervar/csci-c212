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
        assertEquals(Lab3Exercises.pigLatinDecoder("orse-hay"), "horse");
        assertEquals(Lab3Exercises.pigLatinDecoder("ythm-Rhay"), "Rhythm");
        assertEquals(Lab3Exercises.pigLatinDecoder("ou-Yay ust-may ove-lay using-way ava-Jay"), "You must love (wusing/using) Java");
        assertEquals(Lab3Exercises.pigLatinDecoder("Apple-way"), "(wApple/Apple)");
        assertEquals(Lab3Exercises.pigLatinDecoder("oung-Yay"), "Young");
        assertEquals(Lab3Exercises.pigLatinDecoder("urphy-May"), "Murphy");
        assertEquals(Lab3Exercises.pigLatinDecoder("e-Way are-way inners-way"), "We (ware/are) (winners/inners)");
    }
}