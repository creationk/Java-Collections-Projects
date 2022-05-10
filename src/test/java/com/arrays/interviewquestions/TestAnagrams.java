package com.arrays.interviewquestions;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


@Slf4j
class TestAnagrams {
    String a = "abcdef";
    String b = "faecbd";

    /**
     * check whether two words (or phrases) are anagrams or not
     */
    @Test
    void testAnagrams_1() {

        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();

        Arrays.sort(charArrA);
        Arrays.sort(charArrB);

        log.info("Is anagram? {}", (String.valueOf(charArrA)).equals(String.valueOf(charArrB)));

    }

    @Test
    void testAnagram_2() {
        int[] arA = new int[26];
        int[] arB = new int[26];

        a.chars().forEach(x -> arA[x - 'a']++);
        b.chars().forEach(x -> arB[x - 'a']++);

        log.info("Anagram? {}", Arrays.toString(arA).equals(Arrays.toString(arB)));


    }

}
