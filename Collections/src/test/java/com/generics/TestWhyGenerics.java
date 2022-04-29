package com.generics;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
class TestWhyGenerics {
    @Test
    void testWhyGenerics() {
        List intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add("abc");

        log.info("List: {}",intList);



    }
}
