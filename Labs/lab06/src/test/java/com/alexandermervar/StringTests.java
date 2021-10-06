package com.alexandermervar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

import com.alexandermervar.stringclasses.SimpleStringSet;
import com.alexandermervar.stringclasses.StringLinkedList;

public class StringTests {

    StringLinkedList stringLinked = new StringLinkedList("First");

    @Test
    void testStringLinkedListAdd() {
        stringLinked.add("Third");
        assertEquals(stringLinked.getSize(), 2);
        System.out.println(stringLinked.getValue());
        System.out.println(stringLinked.getNextElement().getValue());
        stringLinked.add("Second", 1);
        assertEquals(stringLinked.getSize(), 3);
        assertEquals(stringLinked.getNextElement().getValue(), "Second");
        assertEquals(stringLinked.getNextElement().getNextElement().getValue(), "Third");
    }

    @Test
    void testStringLinkedListIsLastElementInList() {
        assertEquals(stringLinked.isLastElementInList(), true);
        stringLinked.add("Third");
        assertEquals(stringLinked.isLastElementInList(), false);
        assertEquals(stringLinked.getNextElement().isLastElementInList(), true);

    }

    @Test
    void testStringLinkedListContains() {
        assertEquals(stringLinked.contains("Third"), false);
        stringLinked.add("Third");
        stringLinked.add("Second");
        assertEquals(stringLinked.contains("Third"), true);
    }

    @Test
    void testStringLinkedListRemove() {
        assertEquals(stringLinked.contains("First"), true);
        stringLinked.add("Third");
        stringLinked.add("Second");
        stringLinked.remove("Second");
        assertEquals(stringLinked.contains("Second"), false);
    }

    @Test
    void testStringLinkedListToList() {
        stringLinked.add("Second");
        stringLinked.add("Third");
        assertEquals(stringLinked.toList().get(0), "First");
        assertEquals(stringLinked.toList().get(1), "Second");
        assertEquals(stringLinked.toList().get(2), "Third");
    }

    SimpleStringSet simpleString = new SimpleStringSet();

    @Test
    void testSimpleStringGetSize() {
        simpleString.add("First");
        simpleString.add("Second");
        simpleString.add("Third");
        assertEquals(simpleString.getSize(), 3);
    }

    @Test
    void testSimpleStringAdd() {
        simpleString.add("First");
        simpleString.add("Second");
        simpleString.add("Third");
        assertEquals(simpleString.elements().get(0), "First");
        assertEquals(simpleString.elements().get(1), "Second");
        assertEquals(simpleString.elements().get(2), "Third");
        assertThrows(IllegalArgumentException.class, () -> {
            simpleString.add("Second");
        });
    }

    @Test
    void testSimpleStringContains() {
        simpleString.add("First");
        simpleString.add("Second");
        simpleString.add("Third");
        assertEquals(simpleString.contains("Second"), true);
        assertEquals(simpleString.contains("Fourth"), false);
    }

    @Test
    void testSimpleStringRemove() {
        simpleString.add("First");
        simpleString.add("Second");
        simpleString.add("Third");
        assertEquals(simpleString.contains("Second"), true);
        simpleString.remove("Second");
        assertEquals(simpleString.contains("Second"), false);
    }

    @Test
    void testStringLinkedListAddAllFromCollection() {
        StringLinkedList stringLinked2 = new StringLinkedList("Second");
        stringLinked2.add("Third");
        stringLinked.addAllFromCollection(stringLinked2);
        assertEquals(stringLinked.getNextElement().getValue(), "Second");
        assertEquals(stringLinked.getNextElement().getNextElement().getValue(), "Third");
        simpleString.add("First");
        simpleString.add("Second");
        simpleString.add("Third");
        stringLinked.addAllFromCollection(simpleString);
        assertEquals(stringLinked.getNextElement().getNextElement().getNextElement().getNextElement().getValue(), "Second");
    }

    @Test
    void testSimpleStringAddAllFromCollection() {
        simpleString.add("First");
        simpleString.add("Second");
        simpleString.add("Third");

        SimpleStringSet simpleString2 = new SimpleStringSet();

        simpleString2.add("Fourth");
        simpleString2.add("Fifth");
        simpleString2.add("Sixth");

        simpleString.addAllFromCollection(simpleString2);

        assertEquals(simpleString.elements().get(4), "Fifth");
        assertEquals(simpleString.elements().get(2), "Third");

        stringLinked.setValue("Seventh");
        stringLinked.add("Eighth");

        simpleString.addAllFromCollection(stringLinked);

        assertEquals(simpleString.elements().get(6), "Seventh");
        assertEquals(simpleString.elements().get(7), "Eighth");
    }
}
