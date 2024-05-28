package com.example.demo1.java8collection;

import java.util.HashMap;
import java.util.Map;

public class mapPactice2 {
    public static void main(String []args){
        System.out.println("Practice of map and hasmap");
        Map<Integer,String> map = new HashMap<Integer,String>();
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
//            System.out.println(map.get(i));
        }

        for(int a : map.keySet()){

            System.out.println(map.get(a));
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }


        //How to traverse map

    }
}
