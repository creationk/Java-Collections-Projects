package com.arrays.anonymous;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestAnonymousArrays {
    @Test
    void test() {
        int [] a = new int[]{1,2,3};
        doSomeOperation(new int[]{1,2,3});
        doSomeOperation(new int[2]);

    }

    private int doSomeOperation(int[] ints) {
        return Arrays.stream(ints).reduce(0,Integer::sum);
    }
}
