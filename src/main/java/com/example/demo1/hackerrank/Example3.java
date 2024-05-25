package com.example.demo1.hackerrank;

public class Example3 extends A  {
    public void m1() {

        System.out.println("B-m1");

    }

    public static void main(String args[]) {

        A a = new Example3();
//        Example3 a1 = new Example3();

        a.m2();

//        System.out.println(a.hashCode());
//        System.out.println(a1.hashCode());

    }
}

class A {

    public void m1() {

        System.out.println("m1");

    }

    public void m2() {

        System.out.println("m2");

    }


}
