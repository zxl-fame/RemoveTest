package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinkedListTest {
    @Test
    void should_remove_first_null_element_when_remove_null() {
        List<String> list = new LinkedList<>();
        list.add(String.valueOf(1));
        list.add(null);
        list.remove(null);
        list.remove(null);
        assertEquals(1, list.size());
    }

    @Test
    void should_remove_first_notnull_element_when_remove_null() {
        List<String> list = new LinkedList<>();
        list.add(String.valueOf(1));
        list.add(String.valueOf(2));
        list.remove(String.valueOf(1));
        assertEquals(1, list.size());
    }

    @Test
    void should_remove_first_notnull_element_when_remove_notnull() {
        List<String> list = new LinkedList<>();
        list.add(String.valueOf(1));
        list.add(String.valueOf(2));
        list.remove(String.valueOf(3));
        assertEquals(2, list.size());
    }
}