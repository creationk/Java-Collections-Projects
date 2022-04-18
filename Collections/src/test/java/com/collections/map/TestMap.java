package com.collections.map;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.*;

@Slf4j
public class TestMap {
    @Test
    void testHashMap() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "a");
        hm.put(3, "b");
        hm.put(null, "5");
        hm.put(null, "9");
        hm.put(2, "c");
        hm.put(4, "a");
        hm.putIfAbsent(4, "g");
        System.out.println(hm);

        Set<Integer> keySet = hm.keySet();
        Collection<String> values = hm.values();
        System.out.println(keySet);
        System.out.println(values);
        System.out.println("*****************");

        for (Integer i : keySet) {
            System.out.println(hm.get(i));
        }
        for (String s : values) {
            System.out.println(s);
        }
        System.out.println("*****************");

        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();

        for (Map.Entry<Integer, String> me : entrySet) {
            System.out.println(me.getKey() + "," + me.getValue());
        }

        System.out.println("*****************");
        hm.forEach((k, v) -> System.out.println(k + "," + v));

        System.out.println(hm.computeIfPresent(1, (k, v) -> k + v));
        ;
    }

    @Test
    void testHashMapGC() {
        HashMap<Object, Object> hm = new HashMap<>();
        Object obkey1 = new Object();
        Object obkey2 = new Object();
        Object obval1 = new Object();
        Object obval2 = new Object();

        hm.put(obkey1, obval1);
        hm.put(obkey2, obval2);

        obkey1 = null;
        obkey2 = null;

        System.gc();

        System.out.println(hm);

    }

    @Test
    void weakHashMapGC() {
        WeakHashMap<Object, Object> hm = new WeakHashMap<>();
        Object obkey1 = new Object();
        Object obkey2 = new Object();
        Object obval1 = new Object();
        Object obval2 = new Object();

        hm.put(obkey1, obval1);
        hm.put(obkey2, obval2);

        obkey1 = null;
        obkey2 = null;

        System.gc();

        System.out.println(hm);

    }

    @Test
    void testHashMapInternalWorking() {

        //HashMap with initial capacity 16, 0.75 load factor
        HashMap map = new HashMap();

        Map m = new HashMap();

        //HashMap with specified initial capacity and default load factor
        HashMap map2 = new HashMap(20);

        //HashMap with specified initial capacity and specified load factor
        HashMap map3 = new HashMap(20, 0.9f);

        //Equivalent hashMap from Map
        HashMap map4 = new HashMap(m);

        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Science", 90);
        marks.put("Maths", 80);
        marks.put("English", 80);
        //insertion order is not preserved

        marks.put("FB", 10);
        marks.put("Ea", 10);
        //Hash value of both keys is same, these will be stored to same index bucket

        System.out.println(marks);

        marks.put("Science", 70);
        //this will update the value for key science

        System.out.println(marks.get("Ea"));
        //this will return the value for specified key

        System.out.println(marks.keySet());
        //this will return the set of keys present in hash map

        System.out.println(marks.entrySet());
        //this will return the set of entries present in hash map

        System.out.println(marks.values());
        //this will return the collection of values present in hash map

        System.out.println(marks.clone());
        //this will return the shallow copy of hash map

        System.out.println(marks.containsKey("FB"));
        //this will return the true if specified key is present in hash map

        marks.remove("FB", 10);
        //remove key-value pair if specified key-value pair present in hash map

        //containsValue(),replace()..

        marks.putIfAbsent("Hello", 1);
        //assign value 1 to key 'hello' only if specified key 'hello' is absent in hash map

        //we can also concatenate value with key,
        HashMap<String, String> hmap = new HashMap<>();
        hmap.computeIfAbsent("Hello", k -> k + " BasicsStrong");
        System.out.println(hmap);
    }

    @Test
    void testHashTable() {
        //HashMap with initial capacity 16, 0.75 load factor
        Hashtable<String, Integer> marks = new Hashtable<>();
        marks.put("Science", 90);
        marks.put("Maths", 80);
        marks.put("English", 80);
        //insertion order is not preserved

        marks.put("FB", 10);
        marks.put("Ea", 10);
        //Hash value of both keys is same, these will be stored to same index bucket

        System.out.println(marks);

        marks.put("Science", 70);
        //this will update the value for key science

        System.out.println(marks.get("Ea"));
        //this will return the value for specified key

        System.out.println(marks.keySet());
        //this will return the set of keys present in hash map

        System.out.println(marks.entrySet());
        //this will return the set of entries present in hash map

        System.out.println(marks.values());
        //this will return the collection of values present in hash map

        System.out.println(marks.clone());
        //this will return the shallow copy of hash map

        System.out.println(marks.containsKey("FB"));
        //this will return the true if specified key is present in hash map

        marks.remove("FB", 10);
        //remove key-value pair if specified key-value pair present in hash map

        //containsValue(),replace()..

        marks.putIfAbsent("Hello", 1);
        //assign value 1 to key 'hello' only if specified key 'hello' is absent in hash map

        //we can also concatenate value with key,
        Hashtable<String, String> htable = new Hashtable<>();
        htable.computeIfAbsent("Hello", k -> k + " BasicsStrong");
        System.out.println(htable);
    }

    @Test
    void testLinkedHashMap() {
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
        lhm.put(1, 1);
        lhm.put(5, 5);
        lhm.put(3, 3);
        lhm.put(2, 2);

        HashMap<Integer, Integer> hm = new HashMap<>(lhm);

        log.info("HashMap: {}, LinkedHashMao: {}", hm, lhm);
    }

    @Test
    void testIdentityHashMap() {
        String key1 = "key";
        String key2 = new String("key");

        IdentityHashMap<String, Integer> ihm = new IdentityHashMap<>();
        ihm.put(key1, 3);
        ihm.put(key1, 1);
        ihm.put(key2, 2);

        HashMap<String, Integer> hm = new HashMap<>(ihm);

        log.info("HashMap: {}, IdentityHashMap: {}", hm, ihm);
    }

    @Test
    void testNavigableMap() {

        NavigableMap<String,Integer> t = new TreeMap<>();
        t.put("ABC", 123);
        t.put("DEF", 456);
        t.put("HIJ", 789);
        t.put("MNO", 546);
        t.put("PQR", 776);
        t.put("XYZ", 775);
        t.put("JKL", 987);
        t.put("STU", 544);
        t.put("LMN", 543);

        System.out.println(t);

        //various methods
        System.out.println(t.ceilingEntry("HIJ"));
        System.out.println(t.floorKey("PQR"));
        System.out.println(t.higherKey("ABC"));
        System.out.println(t.lowerKey("PQR"));
        System.out.println(t.ceilingKey("XYZ"));
        System.out.println(t.descendingKeySet());
        System.out.println(t.descendingMap());
        System.out.println(t.headMap("JKL"));
        System.out.println(t.headMap("JKL",true));
        System.out.println(t.subMap("PQR", "XYZ"));
        System.out.println(t.subMap("ABC", true, "PQR", false));
        System.out.println(t.tailMap("JKL"));
        System.out.println(t.tailMap("PQR", false));
        System.out.println(t.higherEntry("STU"));
        System.out.println(t.navigableKeySet());
    }

    @Test
    void testTreeMap() {
        TreeMap <String,Integer> tmComp = new TreeMap<>(Comparator.comparingInt(x->x.chars().sum()));
        tmComp.put("abc",4);
        tmComp.put("zad",6);
        tmComp.put("sae",3);

        TreeMap <String,Integer> tm = new TreeMap<>();
        tm.put("abc",4);
        tm.put("zad",6);
        tm.put("sae",3);

        log.info("TreeMap: {}, ComparatorTreeMap: {}",tm,tmComp);
    }
}
