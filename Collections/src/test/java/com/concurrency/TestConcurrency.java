package com.concurrency;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestConcurrency {
    @Test
    void test() {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 3, 4, 3, 4));
        for (Integer i : l) {
            if (i.equals(3))
                l.remove(new Integer(3));
        }
    }

}


