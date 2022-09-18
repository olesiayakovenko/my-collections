package com.oyakovenko.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    MyLinkedList<Integer> linkedList = new MyLinkedList<>();

    @Test
    void add() {
        linkedList.add(34);
        linkedList.add(65);
        linkedList.add(23);
        linkedList.add(799);

        assertEquals(34, linkedList.get(0));
        assertEquals(65, linkedList.get(1));
        assertEquals(23, linkedList.get(2));
        assertEquals(799, linkedList.get(3));
        assertEquals(4, linkedList.size());
    }

    @Test
    void remove() {
        linkedList.add(6784);
        linkedList.add(2234);
        linkedList.add(2544);
        linkedList.add(35);
        linkedList.add(67);

        int removedValue = linkedList.remove(3);

        assertEquals(2544, linkedList.get(2));
        assertEquals(67, linkedList.get(3));
        assertEquals(35, removedValue);
        assertEquals(4, linkedList.size());
    }

    @Test
    void clear() {
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }
        linkedList.clear();

        assertEquals(0, linkedList.size());
    }

    @Test
    void size() {
        assertEquals(0, linkedList.size());

        linkedList.add(44);
        linkedList.add(34);
        linkedList.add(4563);
        linkedList.add(49);

        assertEquals(4, linkedList.size());
    }

    @Test
    void get() {
        linkedList.add(865);
        linkedList.add(5476);
        linkedList.add(23);
        linkedList.add(57);
        linkedList.add(7);

        assertEquals(865, linkedList.get(0));
        assertEquals(5476, linkedList.get(1));
        assertEquals(23, linkedList.get(2));
        assertEquals(57, linkedList.get(3));
        assertEquals(7, linkedList.get(4));
        assertEquals(5, linkedList.size());
    }
}