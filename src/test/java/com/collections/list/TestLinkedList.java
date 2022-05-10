package com.collections.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class TestLinkedList {
    private static final LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

    @Test
    void testAddElement() {
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        int elementToAdd = 40;
        log.info("Adding {} to {} with result {}", elementToAdd, ll, ll1.add(elementToAdd));
    }

    @Test
    void testOffer() {
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        ll1.offer(100);
        log.info("Updated list {}", ll1);
    }

    @Test
    void testRemoveElement() {
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        Integer elementToRemove = 40;
        Integer elementToRemove2 = 1;
        log.info("Removing {} from {} with result {}", elementToRemove, ll, ll1.remove(elementToRemove));
        log.info("Removing {} from {} with result {}", elementToRemove2, ll, ll1.remove(elementToRemove2));

    }

    @Test
    void testRemoveFirstElement() {
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        log.info("Removing first element from {} with result {}", ll, ll1.removeFirst());
    }

    @Test
    void testRemoveLastElement() {
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        log.info("Removing first element from {} with result {}", ll, ll1.removeLast());
    }

    @Test
    void testRemove() { //Removes first element and prints it
        // Throws NoSuchElementException if the list is empty
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        assertEquals(ll1.getFirst(), ll1.remove());
        assertEquals(ll.size() - 1, ll1.size());

        LinkedList<Integer> ll2 = new LinkedList<>();
        assertThrows(NoSuchElementException.class, ll2::remove);

    }

    @Test
    void testPop() { //pop removes first element and prints
        // Throws no such element exception if the list is empty

        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        assertEquals(ll1.getFirst(), ll1.pop());
        assertEquals(ll.size() - 1, ll1.size());

        LinkedList<Integer> ll2 = new LinkedList<>();
        assertThrows(NoSuchElementException.class, ll2::pop);

    }

    @Test
    void testPoll() { //Removes first element and prints it
        // Does not throw NoSuchElementException if the list is empty
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        assertEquals(ll1.getFirst(), ll1.poll());
        assertEquals(ll.size() - 1, ll1.size());

        LinkedList<Integer> ll2 = new LinkedList<>();
        assertDoesNotThrow(ll2::poll);

    }

    @Test
    void testElement() { //Prints first element without removing it
        // Throws NoSuchElementException of the list is empty
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        assertEquals(ll1.getFirst(), ll1.element());
        assertEquals(ll.size(), ll1.size());

        LinkedList<Integer> ll2 = new LinkedList<>();
        assertThrows(NoSuchElementException.class, ll2::element);
    }

    @Test
    void testPeek() { //Prints first element without removing it
        // Does not throw NoSuchElementException of the list is empty
        LinkedList<Integer> ll1 = new LinkedList<>(ll);
        assertEquals(ll1.getFirst(), ll1.peek());
        assertEquals(ll.size(), ll1.size());

        LinkedList<Integer> ll2 = new LinkedList<>();
        assertDoesNotThrow(ll2::peek);
    }

}
