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

    @Test
    public void hexToIntNBin() {
        assertEquals(Lab3Exercises.hexToIntNBin("64"), "Your number is 100 (in decimal) and 1100100 (in binary)");
        assertEquals(Lab3Exercises.hexToIntNBin("7DB7B"), "Your number is 514939 (in decimal) and 1111101101101111011 (in binary)");
        assertEquals(Lab3Exercises.hexToIntNBin("9DF73"), "Your number is 647027 (in decimal) and 10011101111101110011 (in binary)");
        assertEquals(Lab3Exercises.hexToIntNBin("63"), "Your number is 99 (in decimal) and 1100011 (in binary)");
        assertEquals(Lab3Exercises.hexToIntNBin("F4240"), "Your number is 1000000 (in decimal) and 11110100001001000000 (in binary)");
    }
}