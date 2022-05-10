package com.collections.list;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class TestStack {
    @Test
    void testStack() {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        s.pop();
        s.push(4);
        s.push(4);

        s.insertElementAt(1, 0);

        System.out.println(s.peek());
        System.out.println(s.search(4));
        System.out.println(s.get(0));


        System.out.println(s);
    }
}
