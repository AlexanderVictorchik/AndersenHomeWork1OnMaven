package org.HomeWork1;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {

    @org.junit.jupiter.api.Test
    void main() {
        MyList<String> strings = new MyArrayList<>();
    }

    /**
     * Testing size method
     */
    @org.junit.jupiter.api.Test
    void testSize() {
        MyList<Integer> list = new MyArrayList<>(10);
        assertEquals(10, list.size());
        MyList<Integer> list1 = new MyArrayList<>();
        assertEquals(0, list1.size());
    }

    /**
     * Testing simple add method
     */
    @org.junit.jupiter.api.Test
    void testAdd1() {
        MyList<Integer> list0 = new MyArrayList<>();
        list0.add(1);
        list0.add(3);
        list0.add(5);
        list0.add(7);
        list0.add(9);
        assertEquals(1, (int) list0.get(0));
        assertEquals(3, (int) list0.get(1));
        assertEquals(5, (int) list0.get(2));
        assertEquals(7, (int) list0.get(3));
        assertEquals(9, (int) list0.get(4));

        MyList<String> list1 = new MyArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        assertEquals("a", list1.get(0));
        assertEquals("b", list1.get(1));
        assertEquals("c", list1.get(2));
        assertEquals("d", list1.get(3));
        assertEquals("e", list1.get(4));
    }

    /**
     * Testing enhanced add method
     */
    @org.junit.jupiter.api.Test
    void testAdd2() {
        MyList<Integer> list7 = new MyArrayList<>();
        list7.add(1);
        list7.add(3);
        list7.add(7);
        list7.add(2, 5);
        list7.add(9);
        assertEquals(7, list7.get(3));
    }

    /**
     * Testing get method
     */
    @org.junit.jupiter.api.Test
    void testGet() {
        MyList<Integer> list3 = new MyArrayList<>();
        for (int i = 0; i < 20; i++) {
            list3.add(i);
        }
        list3.get(5);
        assertEquals(5, (int) list3.get(5));
    }

    /**
     * Testing remove method
     */
    @org.junit.jupiter.api.Test
    void testRemove() {
        MyList<String> list4 = new MyArrayList<>();
        list4.add("a");
        list4.add("b");
        list4.add("c");
        list4.remove(1);
        assertEquals("c", list4.get(1));
    }

    /**
     * Testing set method
     */
    @org.junit.jupiter.api.Test
    void testSet() {
        MyList<String> list6 = new MyArrayList<>();
        list6.add("d");
        list6.add("e");
        list6.add("f");
        list6.set(1, "z");
        assertEquals("z", list6.get(1));
    }

    /**
     * Testing sort method
     */
    @org.junit.jupiter.api.Test
    void testSort() {
        MyList<Integer[]> list5 = new MyArrayList<>();
        Integer[] integers = new Integer[]{4, 1, 52, 23, 68, 35, 90};
        list5.sort(integers);
        list5.add(integers);
        for (int i = 0; i < list5.size(); i++) {
            System.out.println(Arrays.asList(list5.get(i)));
        }
    }
}
