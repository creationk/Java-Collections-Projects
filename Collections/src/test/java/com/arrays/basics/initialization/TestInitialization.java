package com.arrays.basics.initialization;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class TestInitialization {
    @Test
    void initializeArray() {
        int[] x = {2, 3, 4};

        int[] y = new int[]{3, 4, 5};

        //int[] y = new int[3]{3, 4, 5}; not allowed

        int[] p = new int[3];
        //p = {2,3,4}; not allowed
        p = new int[]{3, 4, 5}; //allowed

        int[] u = new int[6];
        //All array elements automatically initialized to 0

        log.info("u[5] = {}", u[5]);

        int[][] a = new int[2][];
        log.info(Arrays.toString(a[0])); //initialized to null
        //log.info(String.valueOf(a[0][0])); //Cannot load from int array because "a[0]" is null
        a[0] = new int[1];
        log.info("a[0][0] ={}", (a[0][0])); //Cannot load from int array because "a[0]" is null

        int[][] b = {{}, {}, {}};

        for (int[] i : b) {
            log.info(Arrays.toString(i));
        }

        int[][] tw = new int[][]{{1}, {2, 3}, {4, 5, 6}};

        for (int[] i : tw) {
            for (int j : i) {
                log.info("int[i][j]={}", j);
            }
        }

    }
}
