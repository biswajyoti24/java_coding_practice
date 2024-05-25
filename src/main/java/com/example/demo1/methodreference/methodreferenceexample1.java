package com.example.demo1.methodreference;
import com.example.demo1.interfaces.Sayable;
public class methodreferenceexample1 {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }

    public static void singSomething(){
        System.out.println("Hello, this is sing method.");
    }
    public static void main(String[] args) {
        Sayable sayable = methodreferenceexample1::saySomething;
        // Calling interface method
        sayable.say();

        Sayable sayable1 = methodreferenceexample1::singSomething;
        sayable1.say();
    }
}
