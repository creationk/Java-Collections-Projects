package com.generics;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGenericClass {

    @Test
    void test() {

        @Getter
        @Setter
        @AllArgsConstructor
        @ToString
        class Data <T> implements TestGenericInterface<T>{
            // T -> Type parameter
            private T data;

            @Override
            public T getDummyData() {
                return data;
            }
        }

        Data<String> d1 = new Data<>("abc");
        Data<Integer> d2 = new Data<>(123);


        System.out.println(d1);

        //int data = (int) d1.getData(); //compile time error
        int data2 = d2.getData();

        System.out.println(d2.getDummyData());


    }
}
