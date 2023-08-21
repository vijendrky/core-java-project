package com.core.java.chapter_01.tutorial_01;

public class Lab4 {
    public static void main(String[] args) {
        int ab = 97;
        System.out.println(ab);
        int a = ++ab;
        System.out.println(a);
        int b = --ab;
        System.out.println("b "+b);
        int c = --b;
        System.out.println("c "+c);
        int e = -(-ab);
        System.out.println("e "+e);
        System.out.println(ab);
        int f = --ab;
        System.out.println("f "+f);
        System.out.println(ab);
        int mn = -56;
        System.out.println(+mn);
       // System.out.println("+mn "+mn);
        System.out.println(-mn);
        System.out.println(--mn);
        System.out.println(-(-mn));
        System.out.println(--mn);
        char ch = 'A';
        //char ch1 = +ch;
        int xy = +ch;
        System.out.println("xy "+xy);
        byte by1 = 46;
        byte by2 = +46;
        int by4 = +by1;
        System.out.println("by4 "+by4);
    }
}
