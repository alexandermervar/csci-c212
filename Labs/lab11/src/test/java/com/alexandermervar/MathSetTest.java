package com.alexandermervar;

import java.util.*;
import com.alexandermervar.Sets.MathSet;
import org.junit.jupiter.api.Test;

public class MathSetTest {
    
    @Test
    public void MathSetTest () {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(3);
        set2.add(5);

        set3.add(2);
        set3.add(4);
        set3.add(6);

        set4.add(15);
        set4.add(10);
        set4.add(5);

        assertEquals(MathSet.union(set1, set2), "[1, 2, 3, 5]");
    }
    
}
