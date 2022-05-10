package com.generics;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
class TestWhyGenerics {
    @Test
    void testWhyGenerics() {
        List intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add("3");

        log.info("List: {}", intList);
        //A cast is necessary whenever you retrieve a value:
        //Moreover, there is no error checking. You can add values of any class:

        assertThrows(ClassCastException.class, () -> {
            int i = (int) intList.get(2);
        });
    }

    @Test
    void testWithGenerics() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        //intList.add("3"); //compile time error
        //A compiler error is much better than a class cast exception at runtime.
    }
}
