package com.bridgelabz;

public class SwapNumbers {

    public static void main(String[] args) {

        int a = 10, b = 20; // int t;
        a = a + b;
        b = a - b;
        a = a - b;

       /* t = a;
        a = b;
        b = t; */

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}