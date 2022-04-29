package com.arrays.interviewquestions;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@Slf4j
class TestReverseAnArray {
    /**
     * Reversing an array in-place overview
     * The problem is that we want to reverse a T[] array in O(N) linear time complexity
     * and we want the algorithm to be in-place as well - so the algorithm can not use additional memory!
     * <p>
     * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
     */
    @Test
    void testReverseAnArray() {
        //Method 1
        int[] arr = {0, 1, 2, 3, 4};
        int[] revArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            revArray[i] = arr[arr.length - 1 - i];
        }
        log.info(Arrays.toString(revArray));

        //Method 2
        int[] arr2 = {0, 1, 2, 3, 4};
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr2[i];
            arr2[i] = arr2[arr.length - i - 1];
            arr2[arr2.length - i - 1] = temp;
        }
        log.info(Arrays.toString(arr2));

    }

}
