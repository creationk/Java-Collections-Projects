package com.arrays.interviewquestions;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;


/**
 * Design an efficient algorithm to reverse a given integer.
 * If the input of the algorithm is 1234 then the output should be 4321.
 * <p>
 * NOTE: the input is an integer (and not a string) !!!
 */
@Slf4j
class TestReverseAnInteger {
    private static final int INTVAL = 4568290;

    @Test
    void testReverseAnInteger_1() {
        char[] intVal = String.valueOf(INTVAL).toCharArray();
        char temp;
        for (int i = 0; i < intVal.length / 2; i++) {
            temp = intVal[i];
            intVal[i] = intVal[intVal.length - 1 - i];
            intVal[intVal.length - 1 - i] = temp;
        }
        log.info("Reversed integer = {}", Integer.parseInt(String.valueOf(intVal)));
    }

    @Test
    void testReverseAnInteger_2() {
        int num = INTVAL;
        int reversed = 0;

        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num = num / 10;
        }
        log.info("Reversed number = {}", reversed);
    }
}
