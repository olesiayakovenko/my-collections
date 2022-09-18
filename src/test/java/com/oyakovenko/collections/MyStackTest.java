package com.oyakovenko.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {
    MyStack<Integer> stack = new MyStack<>();

    @Test
    void push() {
        stack.push(234);
        stack.push(564);
        stack.push(2);
        stack.push(66);
        stack.push(89);

        assertEquals(89, stack.pop());
        assertEquals(66, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(564, stack.pop());
        assertEquals(234, stack.pop());
    }

    @Test
    void remove() {
        stack.push(6784);
        stack.push(2234);
        stack.push(2544);
        stack.push(35);
        stack.push(67);

        int removedValue = stack.remove(3);

        assertEquals(67, stack.pop());
        assertEquals(35, stack.pop());
        assertEquals(2544, stack.pop());
        assertEquals(6784, stack.pop());
        assertEquals(2234, removedValue);
    }

    @Test
    void clear() {
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        stack.clear();

        assertEquals(0, stack.size());
    }

    @Test
    void size() {
        assertEquals(0, stack.size());

        stack.push(44);
        stack.push(34);
        stack.push(4563);
        stack.push(49);

        assertEquals(4, stack.size());
    }

    @Test
    void peek() {
        stack.push(45);
        stack.push(5434);
        stack.push(3);
        stack.push(677);
        stack.push(43);

        assertEquals(43, stack.peek());
        assertEquals(43, stack.peek());
        assertEquals(43, stack.peek());
        assertEquals(5, stack.size());
    }

    @Test
    void pop() {
        stack.push(45);
        stack.push(5434);
        stack.push(3);
        stack.push(677);
        stack.push(43);

        assertEquals(43, stack.pop());
        assertEquals(677, stack.pop());
        assertEquals(3, stack.pop());
        assertEquals(2, stack.size());
    }
}