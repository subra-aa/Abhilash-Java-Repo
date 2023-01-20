package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Integer[] i=new Integer[]{1,2,3,4,5};
        ArrayList b=new ArrayList(Arrays.asList(i));
        b.add(11);
        b.add(22);
        b.add(2,33);
        b.add(44);
        System.out.println(b);
        System.out.println(b.size());
    }
}
