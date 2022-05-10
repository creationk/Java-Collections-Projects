package com.collections.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
class TestArrayList {
    private static final ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

    @Test
        //Iterable
    void testIterator() {
        Iterator<Integer> it = l.iterator();
        while (it.hasNext()) {
            log.info("Next element - {}", it.next());
        }

    }

    @Test
        //Iterable
    void testSplitIterator() {
        log.info("Class name = {}", l.getClass());
        Spliterator<Integer> it = l.spliterator();

        it.forEachRemaining(x -> log.info("Next element: {}", x));

    }

    @Test
        //Iterable
    void testForEach() {
        l.forEach(x -> log.info("Next element: {}", x));
    }

    @Test
    void testAdd_Success() { //always returns true
        // can accept null values
        Integer e = 100;
        Integer n = null;
        ArrayList<Integer> newL = new ArrayList<>(l);

        log.info("Adding element '{}', which returned '{}' and the new list is '{}'", e, newL.add(e), newL);
        log.info("Adding element '{}', which returned '{}' and the new list is '{}'", n, newL.add(n), newL);
    }

    @Test
    void testRemove_Success_And_Failure() {
        Integer e = 100;
        Integer n = 1;
        ArrayList<Integer> newL = new ArrayList<>(l);
        log.info("Removing element '{}', which returned '{}' and the new list is '{}'", e, newL.remove(e), newL);
        log.info("Removing element '{}', which returned '{}' and the new list is '{}'", n, newL.remove(n), newL);
    }

    @Test
    void testContains() {
        Integer e = 6;
        Integer en = 20;

        log.info("Checking if {} contains {}: {}", l, e, l.contains(e));
        log.info("Checking if {} contains {}: {}", l, en, l.contains(en));

    }

    @Test
    void testAddAll() {
        List<Integer> tempList = new ArrayList<>(l);
        List<Integer> nL = new ArrayList<>(Arrays.asList(31, 32, 33));
        log.info("Adding {} to {} with the result {}", nL, l, tempList.addAll(nL));
    }

    @Test
    void testRemoveAll() {
        List<Integer> tempList = new ArrayList<>(l);
        List<Integer> nL = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> nL2 = new ArrayList<>(Arrays.asList(7, 8, 9));
        List<Integer> nL3 = new ArrayList<>(Arrays.asList(8, 9, 10));

        log.info("Removing {} from {} with the result {}", nL, l, tempList.removeAll(nL));
        log.info("Removing {} from {} with the result {}", nL2, l, tempList.removeAll(nL2));
        log.info("Removing {} from {} with the result {}", nL3, l, tempList.removeAll(nL3));

    }


}
