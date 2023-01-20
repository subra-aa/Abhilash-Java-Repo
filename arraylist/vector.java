package com.arraylist;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector a= new Vector();
        a.add(1);
        a.add(2);
        a.add(0,7);
        a.add(3,78);
        a.add(4);
        a.add(44);
        a.add(55);
        a.add(66);
        a.add(77);
        a.add(88);
        a.add(99);
        a.add(11);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.capacity());
        System.out.println(a.get(6));
        a.remove(3);
        System.out.println(a);

    }
}
