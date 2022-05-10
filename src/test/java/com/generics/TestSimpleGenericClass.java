package com.generics;

import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestSimpleGenericClass {
    @Test
    void testPair_Integer() {
        Pair<Integer, String> p = new Pair<>(1, 3, "c");
        log.info("Pair = {}", p);
    }

    @Test
    void testPair_String() {
        Pair<String, Integer> p = new Pair<>("a", "b", 3);
        log.info("Pair = {}", p);
    }
}

@AllArgsConstructor
@ToString
class Pair<T, U> {
    private T item_1;
    private T item_2;
    private U item_3;
}

