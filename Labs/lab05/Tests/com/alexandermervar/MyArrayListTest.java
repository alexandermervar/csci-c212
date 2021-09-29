package com.alexandermervar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {

    MyArrayList testArrayListOne = new MyArrayList();

    @Test
    void add() {
        testArrayListOne.add(3);
        // Testing Using Other Functions that have been tested because data is private
        assertEquals(1, testArrayListOne.getSize());
        assertEquals("[3]", testArrayListOne.toString());

        testArrayListOne.add(5);
        assertEquals(2, testArrayListOne.getSize());
        assertEquals("[3, 5]", testArrayListOne.toString());

        testArrayListOne.add(7);
        assertEquals(3, testArrayListOne.getSize());
        assertEquals("[3, 5, 7]", testArrayListOne.toString());
    }

    @Test
    void remove() {
        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(4);

        assertEquals("[1, 2, 3, 4]", testArrayListOne.toString());

        testArrayListOne.remove(1);
        assertEquals(3, testArrayListOne.getSize());
        assertEquals("[1, 3, 4]", testArrayListOne.toString());

        testArrayListOne.remove(1);
        assertEquals(2, testArrayListOne.getSize());
        assertEquals("[1, 4]", testArrayListOne.toString());
    }

    @Test
    void testToString() {
        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(4);
        testArrayListOne.add(5);
        testArrayListOne.add(6);
        testArrayListOne.add(7);
        testArrayListOne.add(8);
        testArrayListOne.add(9);
        testArrayListOne.add(10);

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]", testArrayListOne.toString());

        testArrayListOne.add(11);
        testArrayListOne.add(12);
        testArrayListOne.add(13);
        testArrayListOne.add(14);
        testArrayListOne.add(15);
        testArrayListOne.add(16);
        testArrayListOne.add(17);

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]", testArrayListOne.toString());

        testArrayListOne.add(18);
        testArrayListOne.add(19);
        testArrayListOne.add(20);

        assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]", testArrayListOne.toString());
    }

    @Test
    void getSize() {
        assertEquals(0, testArrayListOne.getSize());

        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(4);
        testArrayListOne.add(5);
        testArrayListOne.add(6);
        testArrayListOne.add(7);
        testArrayListOne.add(8);
        testArrayListOne.add(9);
        testArrayListOne.add(10);

        assertEquals(10, testArrayListOne.getSize());

        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(4);
        testArrayListOne.add(5);
        testArrayListOne.add(6);
        testArrayListOne.add(7);
        testArrayListOne.add(8);
        testArrayListOne.add(9);
        testArrayListOne.add(10);

        assertEquals(20, testArrayListOne.getSize());
    }

    @Test
    void isEmpty() {
        assertEquals(true, testArrayListOne.isEmpty());

        testArrayListOne.add(10);

        assertEquals(false, testArrayListOne.isEmpty());
    }

    @Test
    void contains() {
        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(4);
        testArrayListOne.add(5);
        testArrayListOne.add(6);
        testArrayListOne.add(7);
        testArrayListOne.add(8);
        testArrayListOne.add(9);
        testArrayListOne.add(10);
        testArrayListOne.add(4);

        assertEquals(true, testArrayListOne.contains(4));
        assertEquals(true, testArrayListOne.contains(1));
        assertEquals(true, testArrayListOne.contains(10));
        assertEquals(false, testArrayListOne.contains(24));
    }

    @Test
    void indexOf() {
        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(4);
        testArrayListOne.add(5);
        testArrayListOne.add(6);
        testArrayListOne.add(7);
        testArrayListOne.add(8);
        testArrayListOne.add(9);
        testArrayListOne.add(10);
        testArrayListOne.add(4);

        assertEquals(3, testArrayListOne.indexOf(4));
        assertEquals(0, testArrayListOne.indexOf(1));
        assertEquals(9, testArrayListOne.indexOf(10));
        assertEquals(-1, testArrayListOne.indexOf(24));
    }
}