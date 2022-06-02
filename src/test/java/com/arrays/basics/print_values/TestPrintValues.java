package com.arrays.basics.print_values;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class TestPrintValues {
    @Test
    void testArraysToString() {
        int[] arr = {1, 2, 3, 4, 5};
        log.info("Arrays.toString() => {}", Arrays.toString(arr));

        int [][] arr2D = {{1},{2,3},{4,5,6}};
        log.info("Arrays.toString() => {}", Arrays.toString(arr2D));
        log.info("Arrays.toString() => {}", Arrays.deepToString(arr2D));

        int [][][] arr3D = {{{1},{2,3},{4,5,6}},{{1},{2,3},{4,5,6}}};
        log.info("Arrays.toString() => {}", Arrays.deepToString(arr3D));



    }
}
