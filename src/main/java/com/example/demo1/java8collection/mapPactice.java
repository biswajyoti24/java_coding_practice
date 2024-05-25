package com.example.demo1.java8collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapPactice {
    public static void main(String []args){
        System.out.println("Practice of map and hasmap");
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Biswa");
        map.put(3,"Rahul");
        map.put(5,"Sisira");
        map.put(2,"janki");
        map.put(4,"Sisu");
        map.put(6,"Asish");
        map.put(8,"Nagendra");
        map.put(9,"Dilu");
        map.put(8,"Silu");
        System.out.println(map.get(8));
        for(int i=1;i<10;i++){
            System.out.println(map.get(i));
        }

        map.remove(9);
        //How to traverse map
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(Map.Entry<Integer,String> entry : map.entrySet()){

            int kay = entry.getKey();
            if (kay==9){
                System.out.println(map.get(kay));

            }

        }

        for(Integer i:map.keySet()){

            System.out.println(map.get(i));

        }

        for(String i:map.values()){

            System.out.println(i);

        }


        //iterate using whileloop
        Iterator tirv = map.values().iterator();
        while(tirv.hasNext()){

            String name = tirv.next().toString();
            if(tirv.next()=="Biswa")
            System.out.println(name);

        }
    }
}
