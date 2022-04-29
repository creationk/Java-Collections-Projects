package com.collections.list.cursors;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
public class TestCursor {
    @Test
    void testEnumeration() {
        Vector<Integer> v = new Vector<>(Arrays.asList(1, 2, 3, 4, 5));
        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }

    @Test
    void testIterator() {
        List<Integer> i = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Iterator<Integer> it = i.listIterator();
        while (it.hasNext()) {
            Integer value = it.next();
            if (value > 5) it.remove();
        }
        it = i.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    @Test
    void testListIterator() {
        List<Integer> i = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ListIterator<Integer> it = i.listIterator(i.size());

        while (it.hasPrevious()) {
            Integer value = it.previous();
            if (value > 3) it.set(-6);
        }

        log.info(i.toString());
        it = i.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    @Test
    void testSplitIterator() {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Spliterator<Integer> si = l.spliterator();
        //TODO
    }
}
