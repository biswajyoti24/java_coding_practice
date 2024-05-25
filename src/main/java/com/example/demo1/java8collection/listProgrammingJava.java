package com.example.demo1.java8collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class listProgrammingJava {

    public static void main(String[] args){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        System.out.println(list);

        for(String s:list){
            if(s.equals("c")){
              list.remove(5);
            }
            System.out.println(s);
        }
        CopyOnWriteArrayList<String> list1 = new CopyOnWriteArrayList<>(Arrays.asList("a", "b", "c", "d"));
        for (String s : list1) {
            if (s.equals("c")) {
                list1.remove(0);
            }
            System.out.println(s);
        }
        for (String s : list1) {

            System.out.println(s);
        }
    }
}