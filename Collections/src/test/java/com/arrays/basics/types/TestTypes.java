package com.arrays.basics.types;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * <img src="./doc-files/datatype-promotion.png" />
 */
@Slf4j
class TestTypes {

    @Test
    void TestPrimitiveTypes() {
        //Primitive array: can hold any type that can be promoted to the declared type

        int[] x = new int[3];
        x[0] = 'a';
        log.info("a = {}",x[0]);
        //adding char in int array, it can be promoted to int

        byte b = 2;
        x[1] = b;

        //byte and char can be promoted to int

        char[] y= new char[]{'y'};
    }

    @Test
    void testObjectArray() {
        //Object array
        Object[] objArray = new Object[5];
        objArray[0] = new Object();
        log.info(objArray[0].getClass().getName());

        objArray[1] = "8";        //Allowed as string is sub-class of Object
        log.info(objArray[1].getClass().getName());

        objArray[2] = 3; //Allowed as 3 is autoboxed to an Integer object
        log.info(objArray[2].getClass().getName());

        objArray[2] = 4F;
        log.info(objArray[2].getClass().getName());

    }
    @Test
    void testAbstractTypeArray() {
        //Abstract class type arrays
        Number[] numArray = new Number[5];        //can not hold the number class object, because Number is an abstract class
        log.info("Number[] type = {}", numArray.getClass());

        numArray[0] = Integer.valueOf("1");       //can store sub-class objects like Integer,Byte, Long, Float, Double
        numArray[1] = Byte.valueOf("2");
        numArray[2] = Long.valueOf("3");
        numArray[3] = Float.valueOf("4");
        numArray[4] = Double.valueOf("5");

        log.info("Arrays.toString(numArray) = {}",Arrays.toString(numArray));

        for (Number num: numArray){
            log.info("Type = {}",num.getClass());
        }
    }

    @Test
    void testInterfaceTypeArray() {
        //Interface type arrays
        Runnable[] r = new Runnable[5];          //can hold only those class objects which are implementing this interface
        log.info(r.getClass().toString());

        r[0] = new Thread();
        log.info(r[0].getClass().toString());

        log.info(String.valueOf(r[1]));
    }
}
