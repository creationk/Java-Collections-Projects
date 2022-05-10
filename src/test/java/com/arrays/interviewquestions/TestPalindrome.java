package com.arrays.interviewquestions;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class TestPalindrome {
    String a = "abcdedcba";

    @Test
    void testPalindrome() {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != (a.charAt(a.length() - i - 1))) {
                log.info("Not a palindrome");
                return;
            }
        }
        log.info("Is a Palindrome");
    }
}
