package com.oyakovenko.collections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {
    MyQueue<Integer> queue = new MyQueue<>();

    @Test
    void add() {
        queue.add(234);
        queue.add(564);
        queue.add(2);
        queue.add(66);
        queue.add(89);

        assertEquals(234, queue.poll());
        assertEquals(564, queue.poll());
        assertEquals(2, queue.poll());
        assertEquals(66, queue.poll());
        assertEquals(89, queue.poll());
    }

    @Test
    void remove() {
        queue.add(6784);
        queue.add(2234);
        queue.add(2544);
        queue.add(35);
        queue.add(67);

        int removedValue = queue.remove(3);

        assertEquals(6784, queue.poll());
        assertEquals(2234, queue.poll());
        assertEquals(2544, queue.poll());
        assertEquals(67, queue.poll());
        assertEquals(35, removedValue);
    }

    @Test
    void clear() {
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        queue.clear();

        assertEquals(0, queue.size());
    }

    @Test
    void size() {
        assertEquals(0, queue.size());

        queue.add(44);
        queue.add(34);
        queue.add(4563);
        queue.add(49);

        assertEquals(4, queue.size());
    }

    @Test
    void peek() {
        queue.add(45);
        queue.add(5434);
        queue.add(3);
        queue.add(677);
        queue.add(43);

        assertEquals(45, queue.peek());
        assertEquals(45, queue.peek());
        assertEquals(45, queue.peek());
        assertEquals(5, queue.size());
    }

    @Test
    void poll() {
        queue.add(45);
        queue.add(5434);
        queue.add(3);
        queue.add(677);
        queue.add(43);

        assertEquals(45, queue.poll());
        assertEquals(5434, queue.poll());
        assertEquals(3, queue.poll());
        assertEquals(2, queue.size());
    }
}