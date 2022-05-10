package com.collections.set;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
public class TestSet {
    @Test
    void testHashSetInitialization() {
        //creating hashSet: default size=16, default load factor = 0.75
        HashSet<Integer> hs = new HashSet<>();

        //creating hashSet with specified size and default load factor = 0.75
        HashSet<Integer> hs1 = new HashSet<>(100);

        //creating hashSet with specified size and load factor
        HashSet<Integer> hs3 = new HashSet<>(100, .80f);

        Collection<Integer> l = new LinkedList<>();
        //creating equivalent hashSet of arrayList
        HashSet<Integer> hs4 = new HashSet<>(l);
    }

    @Test
    void testHashSetOrderNotPreserved() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("abyz");
        hashSet.add("bcpq");
        hashSet.add("cdmn");
        hashSet.add("deop");
        hashSet.add("efqr");

        log.info(hashSet.toString());

        for (String s : hashSet) {
            System.out.println(s);
        }
    }

    @Test
    void testLinkedHashSetOrderPreserved() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("abyz");
        linkedHashSet.add("bcpq");
        linkedHashSet.add("cdmn");
        linkedHashSet.add("deop");
        linkedHashSet.add("efqr");
        log.info(linkedHashSet.toString());
    }

    @Test
    void testTreeSetOrderedNaturallySortedSet() {
        SortedSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(x -> x.chars().reduce(0, Integer::sum)));
        treeSet.add("abz");
        treeSet.add("bcpq");
        treeSet.add("cmn");
        treeSet.add("deop");
        treeSet.add("eqr");

        log.info(treeSet.toString());

        System.out.println(treeSet.headSet("bcpq"));
        System.out.println(treeSet.tailSet("bcpq"));
        System.out.println(treeSet.subSet("eqr", "deop"));
    }

    @Test
    void testTreeSetNavigableSet() {
        NavigableSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(7);

        System.out.println(treeSet.floor(6));
        System.out.println(treeSet.ceiling(6));
        System.out.println(treeSet.lower(6));
        System.out.println(treeSet.higher(6));

        System.out.println(treeSet.descendingSet());

    }

    @Test
    void testHeteroSetCannotAcceptHeterogeneousElements() {
        TreeSet hetroSet = new TreeSet<>();
        hetroSet.add(1);
        Exception exception = assertThrows(ClassCastException.class, () -> hetroSet.add("2"));
        System.out.println(exception);
    }
}
