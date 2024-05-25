package com.example.demo1.practiceProgrammes;

import java.util.HashMap;

public class PracticeOfHashMap {

    public static void main (String []args){
        HashMap<String,String> testHashMap = new HashMap<>();
        testHashMap.put("name","Biswajyoti");
        testHashMap.put("Address","Charichhak");
        testHashMap.put("Dept","Software");
        System.out.println(testHashMap);
        System.out.println(testHashMap.get("Address"));
        testHashMap.remove("Address");
        System.out.println(testHashMap);
        testHashMap.put("Address","Charichhak");
        System.out.println(testHashMap);
        testHashMap.put("Dept","Electrical");
        System.out.println(testHashMap);

    }
}
