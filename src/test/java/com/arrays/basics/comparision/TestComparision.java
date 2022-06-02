package com.arrays.basics.comparision;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class TestComparision {
    @Test
    void testComparision() {
        int [][][] arr3D1 = {{{1},{2,3},{4,5,6}},{{1},{2,3},{4,5,6}}};
        int [][][] arr3D2 = {{{1},{2,3},{4,5,6}},{{1},{2,3},{4,5,6}}};

        log.info("Equals -> {}", Arrays.equals(arr3D1, arr3D2));
        log.info("Deep Equals -> {}", Arrays.deepEquals(arr3D1, arr3D2));


    }
}
