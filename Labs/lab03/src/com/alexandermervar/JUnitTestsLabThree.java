package com.alexandermervar;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JUnitTestsLabThree {

    @Test
    public void testingPigLatinEncoder() {
        assertEquals(Lab3Exercises.pigLatinEncoder("horse"), "orse-hay");
        assertEquals(Lab3Exercises.pigLatinEncoder("Rhythm"), "ythm-Rhay");
        assertEquals(Lab3Exercises.pigLatinEncoder("You must love using Java"), "ou-Yay ust-may ove-lay using-way ava-Jay");
        assertEquals(Lab3Exercises.pigLatinEncoder("Apple"), "Apple-way");
        assertEquals(Lab3Exercises.pigLatinEncoder("Young"), "oung-Yay");
        assertEquals(Lab3Exercises.pigLatinEncoder("Murphy"), "urphy-May");
    }
}
