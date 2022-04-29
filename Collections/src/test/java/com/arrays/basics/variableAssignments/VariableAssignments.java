package com.arrays.basics.variableAssignments;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class VariableAssignments {

    @Test
    void testVariableAssignments() {
        int[] x = new int[2];
        int[] a = x;    //assigning x to a : No new array is created here

        x[0] = 1;
        log.info(String.valueOf(x[0]));
        log.info(String.valueOf(a[0]));
        a[1] = 2;
        log.info(String.valueOf(x[1]));
        log.info(String.valueOf(a[1]));

        log.info("_______________");

        int[] b = {9, 8, 7};
        int[] c = {11, 22};
        b = c;  //both b and c will point same array c

        for (int e : b) {
            log.info(String.valueOf(e));
        }

        for (int e : c) {
            log.info(String.valueOf(e));
        }

        log.info("_______________");

        String[] s = new String[3];
        log.info("String array type = {}", s.getClass());
        Object[] objArr = new Object[0];
        log.info("Object array type = {}", objArr.getClass());
        objArr = s;
        log.info("Object array type = {}", objArr.getClass());

        //string array can be promoted to object array because there is a parent child relationship between a string and an object

        short[] shorts = new short[2];  //[S
        log.info("Short array type = {}", shorts.getClass());
        int[] ints;

        //int[] ints = shorts;            //Not allowed

        //short element can be promoted to int, but short array type object can not promoted to int array type
        // because there is no parent child relationship between int[] and short[]


    }
}
