package com.arrays.basics.introduction;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestIntroduction {
    /**
     * Items in the array are located right next to each other in the main memory
     * For this reason, they can be accessed by the index
     * Memory address of an element = array's address + index + data size(for eg: 4 bytes if an int)
     * Advantage -> Random access feature -> Running time is O(1)
     */
    @Test
    void test1DArray() {
        //int array x = new int array having 5 values
        int[] x = new int[5];
        //size is mandatory at the time of creation
        //the size is fixed once created
        //array can hold only int values => homogeneous
        //a new keyword is used, which means that x is now an object

        log.info(x.getClass().getName());

        //The size of the array can be zero
        int[] y = new int[0];

        //The size can be a character
        int[] z = new int['a']; //ascii value of a = 97

        //allowed data types are byte, short, char and int as all of them can be promoted to int

        //int [] a = new int [-1];
        //negative array size allows compilation but throws runtime exception

        // int [] c = new int [99999999999];
        //compile time error => Integer number too large

        int[] b = new int[5];
        //heap space occupied = 5*4 (5 times the size of int)
    }

    @Test
    void test2DArray() {
        int[][] x = new int[2][];
        //base sizes are mandatory
        log.info(x.getClass().getName());

        x[0] = new int[2];
        x[1] = new int[5];

        int[][] y = new int[2][3];
        y[0] = new int[2];
        y[1] = new int[5]; //no error
        y[1][4] = 5;
        log.info(y[1][4] + "");

    }

}