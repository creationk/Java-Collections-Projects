package com.arrays.initialization;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
public class TestInitialization {
    @Test
    public void initializeArray() {
        int[] x = {2, 3, 4};

        int[] y = new int[]{3, 4, 5};

        int[] z;
        z = new int[]{4, 3, 5};

        int[] u = new int[6];
        //Automatically initialized to 0

        log.info(String.valueOf(u[5]));

        int[][] a = new int[2][];
        log.info(Arrays.toString(a[0]));

        int[][]b={{},{},{}};

        for (int[] i:b){
            log.info(Arrays.toString(i));
        }

    }
}
