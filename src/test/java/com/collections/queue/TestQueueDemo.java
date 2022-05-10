package com.collections.queue;

import org.junit.jupiter.api.Test;

import java.util.*;

public class TestQueueDemo {
    @Test
    void testQueue() {
        List<Integer> l = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Queue<Integer> q = new ArrayDeque<>(l);
        System.out.println(q);
        System.out.println("Adding 10");
        System.out.println(q.add(10));
        System.out.println(q);
        System.out.println("Offering 11");
        System.out.println(q.offer(11));
        System.out.println(q);
        System.out.println("removing from the head - no exceptions");
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println("polling from the head - no exceptions");
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println("element, retrieves but does not remove");
        System.out.println(q.element());
        System.out.println(q);
        System.out.println("peek, retrieves but does not remove - no exceptions");
        System.out.println(q.peek());
        System.out.println(q);

        //add, offer -> add to the tail of the queue. offer throws no exception if no space
        //remove, poll -> remove from the head. poll no exception if array is empty
        //element, peek -> retrieve from the head but does not remove. peek no exception if array is empty

    }

    @Test
    void testPriorityQueue() {
        List<Integer> l = Arrays.asList(0, 1, 4, 2, 3, 1, 4, 5, 6, 7, 8, 9);
        PriorityQueue<Integer> pq = new PriorityQueue<>(l);
        //prints in the natural order
        System.out.println(pq);

        //changing the default sorting order
        pq = new PriorityQueue<>(Comparator.comparingInt(x -> 0));
        pq.add(10);
        pq.add(70);
        pq.add(40);
        pq.add(60);
        pq.add(70);

        System.out.println(pq);
    }

    @Test
        //TODO
    void testBlockingQueue() {
    }
}
