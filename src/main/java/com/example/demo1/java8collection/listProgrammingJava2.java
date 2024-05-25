package com.example.demo1.java8collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listProgrammingJava2 {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        System.out.println(list);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("c")) {
                itr.remove();  // Remove the current element from the list
            }
//            System.out.println(s);
        }
        System.out.println(list);
    }
}