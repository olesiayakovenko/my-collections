package com.oyakovenko.collections;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList<Integer> arrayList = new MyArrayList<>();

    @Test
    void add() throws NoSuchFieldException, IllegalAccessException {
        arrayList.add(234);
        arrayList.add(111);
        arrayList.add(565);

        Object[] array = getTestArray();

        assertEquals(234, array[0]);
        assertEquals(111, array[1]);
        assertEquals(565, array[2]);
    }

    @Test
    void addWhenArrayListIsFull() throws NoSuchFieldException, IllegalAccessException {
        for (int i = 0; i < 25; i++) {
            arrayList.add(i);
        }

        assertNotEquals(10, getTestArray().length);
        assertEquals(25, arrayList.size());
    }

    @Test
    void addWhenArrayListIsFullWithAssignedCapacity() throws NoSuchFieldException, IllegalAccessException {
        arrayList = new MyArrayList<>(5);
        assertEquals(5, getTestArray().length);

        for (int i = 0; i < 15; i++) {
            arrayList.add(i);
        }

        assertNotEquals(5, getTestArray().length);
        assertEquals(15, arrayList.size());
    }

    @Test
    void remove() throws NoSuchFieldException, IllegalAccessException {
        arrayList.add(6784);
        arrayList.add(2234);
        arrayList.add(2544);
        arrayList.add(35);
        arrayList.add(67);

        Object[] array = getTestArray();
        int removedValue = arrayList.remove(3);

        assertEquals(2544, array[2]);
        assertEquals(67, array[3]);
        assertEquals(35, removedValue);
        assertEquals(4, arrayList.size());
    }

    @Test
    void clear() {
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        arrayList.clear();

        assertEquals(0, arrayList.size());
    }

    @Test
    void size() {
        assertEquals(0, arrayList.size());

        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        assertEquals(5, arrayList.size());
    }

    @Test
    void get() {
        arrayList.add(865);
        arrayList.add(5476);
        arrayList.add(23);
        arrayList.add(57);
        arrayList.add(7);

        assertEquals(865, arrayList.get(0));
        assertEquals(5476, arrayList.get(1));
        assertEquals(23, arrayList.get(2));
        assertEquals(57, arrayList.get(3));
        assertEquals(7, arrayList.get(4));
        assertEquals(5, arrayList.size());
    }

    private Object[] getTestArray() throws IllegalAccessException, NoSuchFieldException {
        Field field = arrayList.getClass().getDeclaredField("values");
        field.setAccessible(true);
        return (Object[]) field.get(arrayList);
    }
}