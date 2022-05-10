package com.collections.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
class TestList {
    @Test
    void testArrayList() {//Creating ArrayList
        Collection c = new ArrayList();
        ArrayList al = new ArrayList();

        //creating ArrayList with specifying size
        ArrayList aList = new ArrayList(30);

		/*creating ArrayList with specified collection.
		ArrayList aList1 = new ArrayList(Collection c);*/

        //adding elements to ArrayList
        al.add("John");
        al.add(true);
        al.add(10);
        log.info(String.valueOf(al));

        //removing element from ArrayList
        al.remove(Integer.valueOf(10)); //if an int is passed, it will remove the element at that position rather than the element itself
        log.info(String.valueOf(al));

        //To get value from ArrayList and print
        log.info(String.valueOf(al.get(1)));

        //To get value from ArrayList (we need to perform typecasting here)
        //boolean b = al.get(1);

        //creating ArrayList using generics
        ArrayList<String> strList = new ArrayList<String>();

        ArrayList<Integer> test = new ArrayList<>(0);
        test.add(1);
        log.info(String.valueOf(test.size()));

        ArrayList<Number> nal = new ArrayList<>();
        byte b = 3;
        Long l = 3L;
        nal.add(1);
        nal.add(2f);
        nal.add(b);
        nal.add(l);

        log.info(String.valueOf(nal));
    }

    @Test
    void testArrayToList() {
        Integer[] arr = {1, 2, 3};
        List<Integer> l = Arrays.asList(arr);
        //arr = (Integer[]) l.toArray();
        System.out.println(Arrays.toString(arr));
    }

    @Test
    void testLinkedList() {

        //creating linkedList
        LinkedList l = new LinkedList();

        //creating linkedList with specified collection
        //LinkedList ll = new LinkedList(Collection c);

        //adding elements in linkedList
        l.add("John");
        l.add(10);
        l.add(null);
        System.out.println(l);

        //to replace element with given element at specified index
        l.set(1, 13);
        System.out.println(l);

        //to add element at specified index without replacing (shifts existing values to the right)
        l.add(2, true);
        System.out.println(l);

        //to remove last element
        l.removeLast();
        System.out.println(l);

        //to add element at first position
        l.addFirst(1);
        System.out.println(l);

    }




}
