package com.example.demo1.codepractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExampleProgramme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Scanner sc1 = new Scanner(System.in);
        Map<Integer,String> person = new HashMap<>();

        for(int i = 0 ; i< 10;i++){
            System.out.println("input a id");
                Integer id = sc.nextInt();
            sc.nextLine();
            System.out.println("input a name");
                String name = sc.next();


            person.put(id,name);
            System.out.println(person);
        }
        sc.close();
        System.out.println(person);
    }
}
