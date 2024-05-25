package com.example.demo1.java8collection;

import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashmapPactice1 {
    public static void main(String []args){
        System.out.println("Practice of map and hasmap");
        ConcurrentHashMap< Integer,String> map = new ConcurrentHashMap<Integer,String>();
        map.put(1,"Biswa");
        map.put(3,"Rahul");
        map.put(5,"Sisira");
        map.put(2,"janki");
        map.put(4,"Sisu");
        map.put(6,"Asish");
        map.put(7,"Nagendra");
        map.put(9,"Dilu");
        map.put(8,"Silu");
        System.out.println(map.get(0));
        map.remove(9);
        for(int i=1;i<10;i++){
            if(i==4){
                map.remove(i);
            }
//            System.out.println(map.get(i));
        }
        for(int i=1;i<10;i++){
           System.out.println(map.get(i));
//            System.out.println(map.get(i));
        }

        for(Integer kay : map.keySet()){
            System.out.println("Key = "+kay +" - Value = "+map.get(kay));
        }

        //How to traverse map

    }
}
