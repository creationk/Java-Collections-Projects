package com.collections.list;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
public class TestList {
    @Test
    void testArrayList() {//Creating ArrayList
        ArrayList al = new ArrayList();

        //creating ArrayList with specifying size
        ArrayList aList =  new ArrayList(30);

		/*creating ArrayList with specified collection.
		ArrayList aList1 = new ArrayList(Collection c);*/

        //adding elements to ArrayList
        al.add("John");
        al.add(true);
        al.add(10);
        System.out.println(al);

        //removing element from ArrayList
        al.remove(new Integer(10));
        System.out.println(al);

        //To get value from ArrayList and print
        System.out.println(al.get(1));

        //To get value from ArrayList (we need to perform typecasting here)
        //boolean b = al.get(1);

        //creating ArrayList using generics
        ArrayList<String> strList = new ArrayList<String>();

        ArrayList<Integer> test = new ArrayList<>(0);
        test.add(1);
        System.out.println(test.size());

        ArrayList<Number> nal = new ArrayList<>();
        byte b = 3;
        Long l = 3L;
        nal.add(1);
        nal.add(2f);
        nal.add(b);
        nal.add(l);

        System.out.println(nal);
    }

    @Test
    void testArrayToList() {
        Integer [] arr = {1,2,3};
        List <Integer> l = Arrays.asList(arr);
        arr = (Integer[]) l.toArray();
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

    @Test
    void testVectors() {


        //creating vector
        Vector v = new Vector();

        //creating vector with specified capacity
        Vector vec = new Vector(60);

        //creating vector with specified capacity and incremental capacity
        Vector vec1 = new Vector(100,5);

        //creating vector with specified collection
        //Vector vec2 = new Vector(Collection c);

        //to add elements in Vector
        v.add(10);
        v.addElement("Hello");
        System.out.println(v);

        //to remove element from vector
        v.remove(0);
        System.out.println(v);
        System.out.println(v.elementAt(0));

        //to get elements
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.get(0));

        System.out.println(v.size());
        System.out.println(v.capacity());
    }

    @Test
    void testStack() {
        Stack s = new Stack();
        s.add(1);
        s.add(2);
        s.add(3);

        s.pop();
        s.push(4);
        s.push(4);

        s.insertElementAt(1,0);

        System.out.println(s.peek());
        System.out.println(s.search(4));
        System.out.println(s.get(0));


        System.out.println(s);
    }
}
