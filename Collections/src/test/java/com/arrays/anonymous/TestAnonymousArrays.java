package com.arrays.anonymous;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class TestAnonymousArrays {
    @Test
    void test() {
        int[] a = new int[]{1, 2, 3};
        int result1 = doSomeOperation(new int[]{1, 2, 3});
        int result2 = doSomeOperation(new int[2]); //new int[2] is not assigned any variable reference. It is hence an anonymous array.
        //In this case, all elements of int[2] and initialized to the default value 0

        log.info("Results 1 and 2 -> {}, {}",result1, result2);

    }

    private int doSomeOperation(int[] ints) {
        log.info(Arrays.toString(ints));

        return Arrays.stream(ints).reduce(0, Integer::sum);

    }
}
