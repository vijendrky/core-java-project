package com.core.java.chapter_01.tutorial_01;

import java.util.ArrayList;

public interface Lab7 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("A");
        a.add(11);
        a.add("A");
        a.add(null);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        a.add(2,"B");
        System.out.println(a);

    }
}
