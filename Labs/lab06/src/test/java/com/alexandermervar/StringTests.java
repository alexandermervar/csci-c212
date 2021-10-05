package com.alexandermervar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

import com.alexandermervar.stringclasses.SimpleStringSet;
import com.alexandermervar.stringclasses.StringLinkedList;

public class StringTests {

    StringLinkedList stringLinked = new StringLinkedList("First");
    SimpleStringSet simpleString = new SimpleStringSet();

    @Test
    void testStringLinkedListAdd() {
        stringLinked.add("Third");
        assertEquals(stringLinked.getSize(), 2);
        System.out.println(stringLinked.getValue());
        System.out.println(stringLinked.getNextElement().getValue());
        //stringLinked.add("Second", 1);
        //assertEquals(stringLinked.getSize(), 3);
        //assertEquals(stringLinked.getNextElement().getValue(), "Second");
    }
}
