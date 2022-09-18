package com.oyakovenko.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {
    MyHashMap<Integer, String> hashMap = new MyHashMap<>();

    @Test
    void put() {
        hashMap.put(null, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");

        assertEquals("zero", hashMap.get(null));
        assertEquals("one", hashMap.get(1));
        assertEquals("two", hashMap.get(2));
        assertEquals("three", hashMap.get(3));
        assertEquals("four", hashMap.get(4));

        String s1 = hashMap.put(2, "second");
        String s2 = hashMap.put(null, "nothing");

        assertEquals("two", s1);
        assertEquals("zero", s2);

        assertEquals("nothing", hashMap.get(null));
        assertEquals("one", hashMap.get(1));
        assertEquals("second", hashMap.get(2));
        assertEquals("three", hashMap.get(3));
        assertEquals("four", hashMap.get(4));
    }

    @Test
    void remove() {
        hashMap.put(null, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");

        hashMap.remove(3);
        hashMap.remove(null);

        assertNull(hashMap.get(null));
        assertNull(hashMap.get(3));
        assertEquals("one", hashMap.get(1));
        assertEquals("two", hashMap.get(2));
        assertEquals("four", hashMap.get(4));
    }

    @Test
    void clear() {
        hashMap.put(null, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");
        hashMap.clear();

        assertEquals(0, hashMap.size());
    }

    @Test
    void size() {
        hashMap.put(null, "zero");
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");

        assertEquals(5, hashMap.size());
    }

    @Test
    void get() {
        hashMap.put(54, "I");
        hashMap.put(3, "love");
        hashMap.put(67, "Java");

        assertEquals("I", hashMap.get(54));
        assertEquals("love", hashMap.get(3));
        assertEquals("Java", hashMap.get(67));
    }
}