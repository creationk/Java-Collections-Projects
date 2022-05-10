package com.hashing;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TestHashing {
    @Test
    void test() {
        String a = "abc";
        String b = "abc";
        String c = new String(a);

        log.info("Hash code for a {}, for b {}, for c {}", a.hashCode(), b.hashCode(), c.hashCode());

        System.out.println(b == c);
    }
}
