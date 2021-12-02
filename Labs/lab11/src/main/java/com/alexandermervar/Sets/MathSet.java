package com.alexandermervar.Sets;

import java.util.*;

public class MathSet {
    
    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<Integer>();
        for (Integer i : set1) {
            if (set2.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<Integer>();
        result.addAll(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> complement(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<Integer>();
        for (Integer i : set1) {
            if (!set2.contains(i)) {
                result.add(i);
            }
        }
        for (Integer i : set2) {
            if (!set1.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
    
}
