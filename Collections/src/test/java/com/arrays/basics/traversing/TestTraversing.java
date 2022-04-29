package com.arrays.basics.traversing;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestTraversing {
    @Test
    void testTraversing() {
        int[][][] intArr = {{{1}, {2, 3}, {4, 5, 6}, {9, 8, 7}, {6, 5}, {4}}, {{3}}};
        log.info("Length of 3d array = {}",intArr.length);

        for (int[][] arr2 : intArr) {
            for (int[] arr1 : arr2) {
                for (int i : arr1) {
                    log.info("i={}", i);
                }
            }
        }
    }
}
