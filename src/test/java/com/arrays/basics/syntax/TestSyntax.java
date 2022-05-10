package com.arrays.basics.syntax;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestSyntax {
    @Test
    void testSyntax() {
        int[] a;

        int b[];

        int[] c, d; //c and d are both arrays
        //int m[],[]n; //not allowed

        int m[], n[];

        int e[], f; //f is an int

        int[] g, h[]; //h is a two dimensional array

        h = new int[][]{{}};

    }
}
